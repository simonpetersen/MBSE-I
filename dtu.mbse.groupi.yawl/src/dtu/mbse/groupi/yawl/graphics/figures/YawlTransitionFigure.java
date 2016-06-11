package dtu.mbse.groupi.yawl.graphics.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.TransitionFigure;

import dtu.mbse.groupi.yawl.Transition;
import dtu.mbse.groupi.yawl.TransitionType;
import dtu.mbse.groupi.yawl.TransitionTypes;

/**
 * 
 * @author Simon s145095
 *
 */
public class YawlTransitionFigure extends TransitionFigure {

	private Type joinType, splitType;

	private enum Type {
		AND, OR, XOR, single
	}

	public YawlTransitionFigure(Transition transition) {
		super(transition);
	}

	public void update() {
		this.repaint();
	}

	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);
		Rectangle rectangle = this.getClientArea();
		graphics.setLineStyle(SWT.LINE_SOLID);
		graphics.setLineWidth(2);
		joinType = getJoinType();
		Point midTop = new Point(rectangle.x + rectangle.width / 3, rectangle.y);
		Point midBottom = new Point(midTop.x, rectangle.y + rectangle.height);
		if (joinType == Type.AND) {
			Point center = new Point(midTop.x, rectangle.y + rectangle.height / 2);
			Point cornerTop = rectangle.getLocation();
			Point cornerBottom = new Point(rectangle.x, rectangle.y + rectangle.height);
			graphics.drawLine(midTop, midBottom);
			graphics.drawLine(center, cornerTop);
			graphics.drawLine(center, cornerBottom);
		} else if (joinType == Type.XOR) {
			Point center = new Point(rectangle.x, rectangle.y + rectangle.height / 2);
			graphics.drawLine(midTop, midBottom);
			graphics.drawLine(midTop, center);
			graphics.drawLine(midBottom, center);
		} else if (joinType == Type.OR) {
			Point centerLeft = new Point(rectangle.x, rectangle.y + rectangle.height / 2);
			Point centerRight = new Point(midTop.x, rectangle.y + rectangle.height / 2);
			Point centerTop = new Point(rectangle.x + (rectangle.width / 3)/2, rectangle.y);
			Point centerBottom = new Point(centerTop.x, rectangle.y + rectangle.height);
			graphics.drawLine(midTop, midBottom);
			graphics.drawLine(centerTop, centerRight);
			graphics.drawLine(centerRight, centerBottom);
			graphics.drawLine(centerBottom, centerLeft);
			graphics.drawLine(centerLeft, centerTop);
		}
		splitType = getSplitType();
		midTop = new Point(rectangle.x+rectangle.width-rectangle.width/3, rectangle.y);
		midBottom = new Point(midTop.x, rectangle.y+rectangle.height);
		if (splitType == Type.XOR) {
			Point center = new Point(rectangle.x+rectangle.width, rectangle.y+rectangle.height/2);
			graphics.drawLine(midTop, midBottom);
			graphics.drawLine(midTop, center);
			graphics.drawLine(midBottom, center);
		} else if (splitType == Type.AND) {
			Point center = new Point(midTop.x, midTop.y + rectangle.height / 2);
			Point rightTop = new Point(rectangle.x + rectangle.width, rectangle.y);
			Point rightBottom = new Point(rightTop.x, rectangle.y + rectangle.height);
			graphics.drawLine(midTop, midBottom);
			graphics.drawLine(center, rightTop);
			graphics.drawLine(center, rightBottom);
		} else if (splitType == Type.OR) {
			Point centerLeft = new Point(midTop.x, rectangle.y + rectangle.height / 2);
			Point centerRight = new Point(rectangle.x + rectangle.width, rectangle.y + rectangle.height / 2);
			Point centerTop = new Point(rectangle.x + rectangle.width - (rectangle.width / 3)/2, rectangle.y);
			Point centerBottom = new Point(centerTop.x, rectangle.y + rectangle.height);
			graphics.drawLine(midTop, midBottom);
			graphics.drawLine(centerTop, centerRight);
			graphics.drawLine(centerRight, centerBottom);
			graphics.drawLine(centerBottom, centerLeft);
			graphics.drawLine(centerLeft, centerTop);
		}
	}

	private Type getJoinType() {
		if (this.transition instanceof Transition) {
			TransitionType joinType = ((Transition) transition).getJoinType();
			if (joinType != null) {
				switch (joinType.getText().getValue()) {
				case TransitionTypes.AND_VALUE:
					return Type.AND;
				case TransitionTypes.OR_VALUE:
					return Type.OR;
				case TransitionTypes.XOR_VALUE:
					return Type.XOR;
				}
			}
		}
		return Type.single;
	}

	private Type getSplitType() {
		if (this.transition instanceof Transition) {
			TransitionType splitType = ((Transition) transition).getSplitType();
			if (splitType != null) {
				switch (splitType.getText().getValue()) {
				case TransitionTypes.XOR_VALUE:
					return Type.XOR;
				case TransitionTypes.AND_VALUE:
					return Type.AND;
				case TransitionTypes.OR_VALUE:
					return Type.OR;
				}
			}
		}
		return Type.single;
	}

}
