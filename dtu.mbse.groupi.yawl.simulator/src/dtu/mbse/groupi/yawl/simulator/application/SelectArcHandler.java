package dtu.mbse.groupi.yawl.simulator.application;

import org.eclipse.draw2d.MouseEvent;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;

import dtu.mbse.groupi.yawl.Transition;
import dtu.mbse.groupi.yawl.TransitionTypes;
import dtu.mbse.groupi.yawlsimulator.EnabledTransition;
import dtu.mbse.groupi.yawlsimulator.SelectArc;

public class SelectArcHandler implements IActionHandler {
	
	private YawlSimulatorApplication application;
	
	public SelectArcHandler(YawlSimulatorApplication application) {
		super();
		this.application = application;
	}

	@Override
	public boolean mouseDoubleClicked(MouseEvent arg0, ObjectAnnotation annotation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mousePressed(MouseEvent arg0, ObjectAnnotation annotation) {
		if (annotation instanceof SelectArc) {
			SelectArc arcAnnotation = (SelectArc) annotation;
			if (arcAnnotation.getTargetTransition() != null) {
				EnabledTransition transition = arcAnnotation.getTargetTransition();
				arcAnnotation.setSelected(true);
				for (SelectArc arc : transition.getInArcs()) {
					if (arc != arcAnnotation)
						arc.setSelected(false);
				}
			}
			else if (arcAnnotation.getSourceTransition() != null) {
				EnabledTransition transition = arcAnnotation.getSourceTransition();
				Object object = transition.getObject();
				if (object instanceof Transition) {
					// XOR-Split
					if (((Transition) object).getSplitType().getText() == TransitionTypes.XOR) {
						arcAnnotation.setSelected(true);
						for (SelectArc arc : transition.getOutArcs()) {
							if (arc != arcAnnotation)
								arc.setSelected(false);
						}
					} 
					// OR-Split
					else if (((Transition) object).getSplitType().getText() == TransitionTypes.OR) {
						int selected = 0;
						for (SelectArc arc : transition.getOutArcs()) {
							if (arc.isSelected())
								selected++;
						}
						if (selected > 1) arcAnnotation.setSelected(!arcAnnotation.isSelected());
						else arcAnnotation.setSelected(true);
					}
				}
			}
			application.update();
			return true; 
		}
		return false;
	}

	@Override
	public boolean mouseReleased(MouseEvent arg0, ObjectAnnotation annotation) {
		// TODO Auto-generated method stub
		return false;
	}

}
