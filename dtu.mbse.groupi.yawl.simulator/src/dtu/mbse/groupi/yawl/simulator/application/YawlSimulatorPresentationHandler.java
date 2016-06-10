package dtu.mbse.groupi.yawl.simulator.application;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IPresentationHandler;
import org.pnml.tools.epnk.applications.ui.figures.PolylineOverlay;

import dtu.mbse.groupi.yawlsimulator.SelectArc;

public class YawlSimulatorPresentationHandler implements IPresentationHandler {

	@Override
	public IFigure handle(ObjectAnnotation annotation, AbstractGraphicalEditPart editPart) {
		if (annotation instanceof SelectArc) {
			SelectArc arcAnnotation = (SelectArc) annotation;
			if (editPart instanceof ConnectionNodeEditPart) {
				ConnectionNodeEditPart graphicalEditPart = (ConnectionNodeEditPart) editPart;
				PolylineOverlay overlay = new PolylineOverlay(graphicalEditPart);
				if (!arcAnnotation.isSelected())
					overlay.setForegroundColor(ColorConstants.gray);
				return overlay;
			}
		} 
		return null;
	}

}
