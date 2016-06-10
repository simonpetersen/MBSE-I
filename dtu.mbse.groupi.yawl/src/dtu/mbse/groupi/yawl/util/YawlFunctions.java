package dtu.mbse.groupi.yawl.util;

import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;

public class YawlFunctions {
	
	public static boolean isEndPlace(Place place) {
		return (!place.getIn().isEmpty() && place.getOut().isEmpty());
	}
	
	public static boolean isStartPlace(Place place) {
		return (place.getIn().isEmpty() && !place.getOut().isEmpty());
	}

}
