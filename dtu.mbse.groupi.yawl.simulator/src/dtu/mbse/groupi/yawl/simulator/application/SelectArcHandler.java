package dtu.mbse.groupi.yawl.simulator.application;

import org.eclipse.draw2d.MouseEvent;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;

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
			SelectArc placeAnnotation = (SelectArc) annotation;
			placeAnnotation.setSelected(!placeAnnotation.isSelected());
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
