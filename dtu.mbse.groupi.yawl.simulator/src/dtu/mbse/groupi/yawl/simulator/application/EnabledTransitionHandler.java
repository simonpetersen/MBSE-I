package dtu.mbse.groupi.yawl.simulator.application;

import java.util.Map;

import org.eclipse.draw2d.MouseEvent;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;

import dtu.mbse.groupi.yawl.Place;
import dtu.mbse.groupi.yawl.Transition;
import dtu.mbse.groupi.yawlsimulator.EnabledTransition;

public class EnabledTransitionHandler implements IActionHandler {

	private YawlSimulatorApplication application;

	public EnabledTransitionHandler(YawlSimulatorApplication application) {
		super();
		this.application = application;
	}

	@Override
	public boolean mouseDoubleClicked(MouseEvent arg0, ObjectAnnotation annotation) {
		if (annotation instanceof EnabledTransition) {
			Object object = annotation.getObject();
			if (object instanceof Transition) {
				Transition transition = (Transition) object;
				Map<Place, Integer> marking = application.computeMarking();
				marking = application.fireTransition(marking, transition);
				NetAnnotation netAnnotation = application.computeAnnotation(marking);
				application.getNetAnnotations().setCurrent(netAnnotation);
			}
		}
		return false;
	}

	@Override
	public boolean mousePressed(MouseEvent arg0, ObjectAnnotation annotation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseReleased(MouseEvent arg0, ObjectAnnotation annotation) {
		// TODO Auto-generated method stub
		return false;
	}

}
