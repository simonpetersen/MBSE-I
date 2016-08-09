package dtu.mbse.groupi.yawl.simulator.application;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IPresentationHandler;
import org.pnml.tools.epnk.applications.ui.figures.EllipseOverlay;
import org.pnml.tools.epnk.applications.ui.figures.PolylineOverlay;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;

import dtu.mbse.groupi.yawlsimulator.PossibleToken;
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
		} else if (annotation instanceof PossibleToken) {
			if (annotation.getObject() instanceof Arc) {
				if (editPart instanceof ConnectionNodeEditPart) {
					ConnectionNodeEditPart graphicalEditPart = (ConnectionNodeEditPart) editPart;
					PolylineOverlay overlay = new PolylineOverlay(graphicalEditPart);
					overlay.setBackgroundColor(ColorConstants.blue);
					overlay.setForegroundColor(ColorConstants.blue);
					return overlay;
				}
			}
			if (editPart instanceof GraphicalEditPart) {
				GraphicalEditPart graphicalEditPart = (GraphicalEditPart) editPart;
				EllipseOverlay overlay = new EllipseOverlay(graphicalEditPart);
				overlay.setBackgroundColor(ColorConstants.blue);
				overlay.setForegroundColor(ColorConstants.blue);
				return overlay;
			}
		}
		return null;
	}

}
