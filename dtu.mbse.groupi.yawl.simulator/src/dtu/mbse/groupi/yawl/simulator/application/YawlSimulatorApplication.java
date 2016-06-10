package dtu.mbse.groupi.yawl.simulator.application;

import java.util.HashMap;
import java.util.Map;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.applications.ui.ApplicationUIManager;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import dtu.mbse.groupi.yawl.Place;
import dtu.mbse.groupi.yawlsimulator.EnabledTransition;
import dtu.mbse.groupi.yawlsimulator.Marking;
import dtu.mbse.groupi.yawlsimulator.YawlsimulatorFactory;

public class YawlSimulatorApplication extends ApplicationWithUIManager {

	public YawlSimulatorApplication(PetriNet petrinet) {
		super(petrinet);
		getNetAnnotations().setName("Yawl Simulator");
		ApplicationUIManager manager = this.getPresentationManager();
		manager.addActionHandler(new SelectArcHandler(this));
		manager.addActionHandler(new EnabledTransitionHandler(this));
		manager.addPresentationHandler(new YawlSimulatorPresentationHandler());
	}

	@Override
	protected void initializeContents() {
		FlatAccess flatNet = new FlatAccess(this.getPetrinet());
		Map<Place, Integer> initialMarking = computeInitialMarking(flatNet);
		NetAnnotation initialAnnotation = computeAnnotation(flatNet, initialMarking);
		initialAnnotation.setNet(this.getPetrinet());
		this.getNetAnnotations().getNetAnnotations().add(initialAnnotation);
		this.getNetAnnotations().setCurrent(initialAnnotation);
	}

	Map<Place, Integer> computeInitialMarking(FlatAccess flatNet) {
		Map<Place, Integer> marking = new HashMap<Place, Integer>();
		for (org.pnml.tools.epnk.pnmlcoremodel.Place place : flatNet.getPlaces()) {
			if (place instanceof Place) {
				Place yawlPlace = (Place) place;
				marking.put(yawlPlace, 1);
			}
		}
		return marking;
	}

	NetAnnotation computeAnnotation(FlatAccess flatNet, Map<Place, Integer> marking) {
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

		for (Node transition : flatNet.getTransitions()) {
			if (transition instanceof Transition) {
				if (enabled(flatNet, marking, (Transition) transition)) {
					EnabledTransition transitionAnnotation = YawlsimulatorFactory.eINSTANCE.createEnabledTransition();
					transitionAnnotation.setObject(transition);
					annotation.getObjectAnnotations().add(transitionAnnotation);
				}
			}
		}
		return annotation;
	}

	boolean enabled(FlatAccess flatNet, Map<Place, Integer> marking, Transition transition) {
		for (Arc arc : flatNet.getIn(transition)) {
			if (arc instanceof Arc) {
				Object source = arc.getSource();
				if (source instanceof PlaceNode) {
					source = flatNet.resolve((PlaceNode) source);
					if (source instanceof Place) {
						if (marking.containsKey(source)) {
							int available = marking.get(source);
							if (available > 0)
								return true;
						}
					}

				}
			}
		}
		return false;
	}

}
