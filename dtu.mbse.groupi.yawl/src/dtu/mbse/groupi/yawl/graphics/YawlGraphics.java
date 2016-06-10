package dtu.mbse.groupi.yawl.graphics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IArcFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import dtu.mbse.groupi.yawl.YawlPackage;
import dtu.mbse.groupi.yawl.graphics.figures.YawlArcFigure;
import dtu.mbse.groupi.yawl.graphics.figures.YawlPlaceFigure;
import dtu.mbse.groupi.yawl.graphics.figures.YawlTransitionFigure;
/**
 * 
 * @author Simon s145095
 *
 */
public class YawlGraphics extends GraphicalExtension {
	
	@Override
	public List<EClass> getExtendedNetTypes() {
		List<EClass> r = new ArrayList<EClass>();
		r.add(YawlPackage.eINSTANCE.getYawlNet());
		return r;
	}
	
	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		List<EClass> list = new ArrayList<EClass>();
		if (netType.equals(YawlPackage.eINSTANCE.getYawlNet())) {
			list.add(YawlPackage.eINSTANCE.getArc());
			list.add(YawlPackage.eINSTANCE.getPlace());
			list.add(YawlPackage.eINSTANCE.getTransition());
		}
		return list;
	}
	
	@Override
	public IArcFigure createArcFigure(Arc arc) {
		if (arc instanceof dtu.mbse.groupi.yawl.Arc)
			return new YawlArcFigure((dtu.mbse.groupi.yawl.Arc) arc);
		return null;
	}
	
	@Override
	public IUpdateableFigure createPlaceFigure(Place place) {
		if (place instanceof dtu.mbse.groupi.yawl.Place)
			return new YawlPlaceFigure(place);
		return null;
	}
	
	@Override
	public IUpdateableFigure createTransitionFigure(Transition transition) {
		if (transition instanceof dtu.mbse.groupi.yawl.Transition)
			return new YawlTransitionFigure((dtu.mbse.groupi.yawl.Transition) transition);
		return null;
	}
}
