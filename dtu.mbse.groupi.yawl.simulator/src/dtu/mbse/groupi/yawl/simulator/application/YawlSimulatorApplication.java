package dtu.mbse.groupi.yawl.simulator.application;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.applications.ui.ApplicationUIManager;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;

import dtu.mbse.groupi.yawl.ArcTypes;
import dtu.mbse.groupi.yawl.Place;
import dtu.mbse.groupi.yawl.Transition;
import dtu.mbse.groupi.yawl.TransitionTypes;
import dtu.mbse.groupi.yawl.util.YawlFunctions;
import dtu.mbse.groupi.yawlsimulator.EnabledTransition;
import dtu.mbse.groupi.yawlsimulator.Marking;
import dtu.mbse.groupi.yawlsimulator.PossibleToken;
import dtu.mbse.groupi.yawlsimulator.SelectArc;
import dtu.mbse.groupi.yawlsimulator.YawlsimulatorFactory;

/**
 * 
 * @author Simon
 *
 */
public class YawlSimulatorApplication extends ApplicationWithUIManager {

	private FlatAccess flatNet;

	public YawlSimulatorApplication(PetriNet petrinet) {
		super(petrinet);
		getNetAnnotations().setName("Yawl Simulator");
		ApplicationUIManager manager = this.getPresentationManager();
		manager.addActionHandler(new SelectArcHandler(this));
		manager.addActionHandler(new EnabledTransitionHandler(this));
		manager.addPresentationHandler(new YawlSimulatorPresentationHandler());
		setFlatNet();
	}

	public void setFlatNet() {
		if (flatNet == null) {
			flatNet = new FlatAccess(this.getPetrinet());
		}
	}

	@Override
	protected void initializeContents() {
		FlatAccess flatNet = new FlatAccess(this.getPetrinet());
		Map<Place, Integer> initialMarking = computeInitialMarking(flatNet);
		NetAnnotation initialAnnotation = computeAnnotation(initialMarking);
		initialAnnotation.setNet(this.getPetrinet());
		this.getNetAnnotations().getNetAnnotations().add(initialAnnotation);
		this.getNetAnnotations().setCurrent(initialAnnotation);
	}

	Map<Place, Integer> computeInitialMarking(FlatAccess flatNet) {
		Map<Place, Integer> marking = new HashMap<Place, Integer>();
		for (org.pnml.tools.epnk.pnmlcoremodel.Place place : flatNet.getPlaces()) {
			if (place instanceof Place) {
				Place yawlPlace = (Place) place;
				if (YawlFunctions.isStartPlace(yawlPlace))
					marking.put(yawlPlace, 1);
			}
		}
		return marking;
	}

	Map<Place, Integer> computeMarking() {
		Map<Place, Integer> marking = new HashMap<Place, Integer>();
		NetAnnotation annotation = this.getNetAnnotations().getCurrent();
		for (ObjectAnnotation objectAnnotation : annotation.getObjectAnnotations()) {
			if (objectAnnotation instanceof Marking) {
				Marking markingAnnotation = (Marking) objectAnnotation;
				Object object = markingAnnotation.getObject();
				if (object instanceof Place) {
					marking.put((Place) object, markingAnnotation.getValue());
				}
			}
		}
		return marking;
	}

	NetAnnotation computeAnnotation(Map<Place, Integer> marking) {
		setFlatNet();
		NetAnnotation annotation = NetannotationsFactory.eINSTANCE.createNetAnnotation();
		for (Place place : marking.keySet()) {
			if (place instanceof Place) {
				int value = marking.get(place);
				if (value > 0) {
					Marking markingAnnotation = YawlsimulatorFactory.eINSTANCE.createMarking();
					markingAnnotation.setValue(value);
					markingAnnotation.setObject(place);
					annotation.getObjectAnnotations().add(markingAnnotation);
				}
			}
		}

		for (Node node : flatNet.getTransitions()) {
			if (node instanceof Transition) {
				Transition transition = (Transition) node;
				if (enabled(marking, transition)) {
					EnabledTransition transitionAnnotation = YawlsimulatorFactory.eINSTANCE.createEnabledTransition();
					transitionAnnotation.setObject(transition);
					annotation.getObjectAnnotations().add(transitionAnnotation);
					if (transition.getSplitType().getText() == TransitionTypes.OR
							|| transition.getSplitType().getText() == TransitionTypes.XOR) {
						for (Arc arc : transition.getOut()) {
							SelectArc selectArc = YawlsimulatorFactory.eINSTANCE.createSelectArc();
							selectArc.setObject(arc);
							selectArc.setSourceTransition(transitionAnnotation);
							transitionAnnotation.getOutArcs().add(selectArc);
							annotation.getObjectAnnotations().add(selectArc);
						}
						if (transitionAnnotation.getOutArcs().size() > 0)
							transitionAnnotation.getOutArcs().get(0).setSelected(true);
					}
					if (transition.getJoinType().getText() == TransitionTypes.XOR) {
						for (Arc arc : transition.getIn()) {
							Node source = arc.getSource();
							if (source instanceof Place) {
								Place place = (Place) source;
								if (marking.containsKey(place) && marking.get(place) > 0) {
									SelectArc selectArc = YawlsimulatorFactory.eINSTANCE.createSelectArc();
									selectArc.setObject(arc);
									selectArc.setTargetTransition(transitionAnnotation);
									transitionAnnotation.getOutArcs().add(selectArc);
									annotation.getObjectAnnotations().add(selectArc);
								}
							}
						}
						if (transitionAnnotation.getInArcs().size() > 0)
							transitionAnnotation.getInArcs().get(0).setSelected(true);
					}
					// Marker PossibleTokens
					possibleTokenMarking(transition, marking, annotation);
				}
			}
		}
		return annotation;
	}

	boolean enabled(Map<Place, Integer> marking, Transition transition) {
		if (transition instanceof dtu.mbse.groupi.yawl.Transition) {
			dtu.mbse.groupi.yawl.Transition yawlTransition = (dtu.mbse.groupi.yawl.Transition) transition;
			if (yawlTransition.getJoinType().getText() == TransitionTypes.AND) {
				for (Arc arc : flatNet.getIn(transition)) {
					if (arc instanceof Arc) {
						Object source = arc.getSource();
						if (source instanceof PlaceNode) {
							source = flatNet.resolve((PlaceNode) source);
							if (source instanceof Place) {
								if (!marking.containsKey(source) || marking.get(source) == 0)
									return false;
							}

						}
					}
				}
				return true;
			} else {
				for (Arc arc : flatNet.getIn(transition)) {
					if (arc instanceof Arc) {
						Object source = arc.getSource();
						if (source instanceof PlaceNode) {
							source = flatNet.resolve((PlaceNode) source);
							if (source instanceof Place) {
								if (marking.containsKey(source)) {
									if (marking.get(source) > 0)
										return true;
								}
							}

						}
					}
				}
				return false;
			}
		}
		return false;

	}

	Map<Place, Integer> fireTransition(Map<Place, Integer> marking1, EnabledTransition transitionAnnotation) {
		setFlatNet();
		Map<Place, Integer> marking2 = new HashMap<Place, Integer>();
		for (Place place : marking1.keySet()) {
			marking2.put(place, marking1.put(place, marking1.get(place)));
		}

		Transition transition = (Transition) transitionAnnotation.getObject();

		if (transition.getJoinType().getText() == TransitionTypes.XOR) {
			for (SelectArc selectArc : transitionAnnotation.getInArcs()) {
				if (selectArc.isSelected()) {
					Object object = selectArc.getObject();
					if (object instanceof dtu.mbse.groupi.yawl.Arc) {
						dtu.mbse.groupi.yawl.Arc arc = (dtu.mbse.groupi.yawl.Arc) object;
						if (arc.getSource() instanceof Place) {
							Place place = (Place) arc.getSource();
							decrease(marking1, marking2, place, arc);
						}
					}
				}
			}
		} else {
			for (Arc arc : flatNet.getIn(transition)) {
				Object source = arc.getSource();
				if (source instanceof PlaceNode) {
					source = flatNet.resolve((PlaceNode) source);
					if (source instanceof dtu.mbse.groupi.yawl.Place) {
						Place place = (Place) source;
						decrease(marking1, marking2, place, arc);
						if (transition.getJoinType().getText() == TransitionTypes.SINGLE)
							break;
					}
				}
			}
		}

		if (transition.getSplitType().getText() == TransitionTypes.XOR
				|| transition.getSplitType().getText() == TransitionTypes.OR) {
			for (SelectArc selectArc : transitionAnnotation.getOutArcs()) {
				if (selectArc.isSelected()) {
					Object object = selectArc.getObject();
					if (object instanceof Arc) {
						Arc arc = (Arc) object;
						Node target = arc.getTarget();
						if (target instanceof Place) {
							Place place = (Place) target;
							increase(marking1, marking2, place);
						}
					}

				}
			}
		} else {
			for (Arc arc : flatNet.getOut(transition)) {
				if (arc instanceof dtu.mbse.groupi.yawl.Arc) {
					Arc yawlArc = (dtu.mbse.groupi.yawl.Arc) arc;
					Object target = yawlArc.getTarget();
					if (target instanceof PlaceNode) {
						target = flatNet.resolve((PlaceNode) target);
						if (target instanceof Place) {
							Place place = (Place) target;
							increase(marking1, marking2, place);
							if (transition.getSplitType().getText() == TransitionTypes.SINGLE)
								break;
						}
					}
				}
			}
		}

		return marking2;
	}

	void decrease(Map<Place, Integer> marking1, Map<Place, Integer> marking2, Place place, Arc arc) {
		if (arc instanceof dtu.mbse.groupi.yawl.Arc) {
			dtu.mbse.groupi.yawl.Arc yawlArc = (dtu.mbse.groupi.yawl.Arc) arc;
			if (yawlArc.getType() != null && yawlArc.getType().getText() == ArcTypes.RESET) {
				marking2.put(place, 0);
			} else {
				int available = 0;
				if (marking1.containsKey(place)) {
					available = marking1.get(place);
				}
				int needed = 1;
				marking2.put(place, available - needed);
			}
		}
	}

	void increase(Map<Place, Integer> marking1, Map<Place, Integer> marking2, Place place) {
		int available = 0;
		if (marking1.containsKey(place)) {
			available = marking1.get(place);
		}
		int provided = 1;
		marking2.put(place, available + provided);
	}

	private void possibleTokenMarking(Transition transition, Map<Place, Integer> marking, NetAnnotation annotation) {
		for (Arc arc : transition.getIn()) {
			Node source = arc.getSource();
			if (source instanceof Place) {
				Place place = (Place) source;
				if (!marking.containsKey(place) || marking.get(place) == 0) {
					for (Arc inArc : place.getIn()) {
						Node arcSource = inArc.getSource();
						if (arcSource instanceof Transition) {
							Transition sourceTransition = (Transition) arcSource;
							if (enabled(marking, sourceTransition)) {
								PossibleToken placeAnnotation = YawlsimulatorFactory.eINSTANCE.createPossibleToken();
								placeAnnotation.setObject(place);
								PossibleToken placeArcAnnotation = YawlsimulatorFactory.eINSTANCE.createPossibleToken();
								placeArcAnnotation.setObject(inArc);
								PossibleToken arcAnnotation = YawlsimulatorFactory.eINSTANCE.createPossibleToken();
								arcAnnotation.setObject(arc);
								annotation.getObjectAnnotations().add(arcAnnotation);
								annotation.getObjectAnnotations().add(placeArcAnnotation);
								annotation.getObjectAnnotations().add(placeAnnotation);
							}
						}
					}
				}
			}
		}
	}
}
