package dtu.mbse.groupi.yawl.graphics.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Path;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.PlaceFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Place;

import dtu.mbse.groupi.yawl.util.YawlFunctions;
/**
 * 
 * @author Simon s145095
 *
 */
public class YawlPlaceFigure extends PlaceFigure {

	public YawlPlaceFigure(Place place) {
		super(place);
	}
	
	public void update() {
		this.repaint();
	}
	
	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);
		Rectangle rectangle = this.getClientArea();
		rectangle.x = rectangle.x + rectangle.width / 4;
		rectangle.y = rectangle.y + rectangle.height / 4;
		rectangle.height = rectangle.height / 2;
		rectangle.width = rectangle.width / 2;
		if (YawlFunctions.isEndPlace(place)) {
			graphics.setBackgroundColor(new Color(null, 250, 10, 10));
			graphics.fillRectangle(rectangle);
		} else if (YawlFunctions.isStartPlace(place)){
			Path path = new Path(null);
			path.moveTo(rectangle.x, rectangle.y);
			path.lineTo(rectangle.x, rectangle.y+rectangle.height);
			path.lineTo(rectangle.x+rectangle.height, rectangle.y+rectangle.height/2);
			path.lineTo(rectangle.x, rectangle.y);
			graphics.setBackgroundColor(new Color(null, 10, 215, 40));
			graphics.fillPath(path);
		}
	}

}
