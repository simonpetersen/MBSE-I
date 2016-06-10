package dtu.mbse.groupi.yawl.graphics.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.TransitionFigure;

import dtu.mbse.groupi.yawl.JoinType;
import dtu.mbse.groupi.yawl.JoinTypes;
import dtu.mbse.groupi.yawl.SplitType;
import dtu.mbse.groupi.yawl.SplitTypes;
import dtu.mbse.groupi.yawl.Transition;

/**
 * 
 * @author Simon s145095
 *
 */
public class YawlTransitionFigure extends TransitionFigure {

	private JType jType;
	private SType sType;

	private enum JType {
		ANDjoin, other
	}

	private enum SType {
		XORsplit, other
	}

	public YawlTransitionFigure(Transition transition) {
		super(transition);
	}

	public void update() {
		this.repaint();
	}

	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);
		jType = getJoinType();
		Rectangle rectangle = this.getClientArea();
		graphics.setLineStyle(SWT.LINE_SOLID);
		graphics.setLineWidth(2);
		if (jType == JType.ANDjoin) {
			Point midTop = new Point(rectangle.x + rectangle.width / 3, rectangle.y);
			Point midBottom = new Point(midTop.x, rectangle.y + rectangle.height);
			Point center = new Point(rectangle.x + rectangle.width / 3, rectangle.y + rectangle.height / 2);
			Point cornerTop = rectangle.getLocation();
			Point cornerBottom = new Point(rectangle.x, rectangle.y + rectangle.height);
			graphics.drawLine(midTop, midBottom);
			graphics.drawLine(center, cornerTop);
			graphics.drawLine(center, cornerBottom);
		}
		sType = getSplitType();
		if (sType == SType.XORsplit) {
			Point midTop = new Point(rectangle.x+rectangle.width-rectangle.width/3, rectangle.y);
			Point midBottom = new Point(midTop.x, rectangle.y+rectangle.height);
			Point center = new Point(rectangle.x+rectangle.width, rectangle.y+rectangle.height/2);
			graphics.drawLine(midTop, midBottom);
			graphics.drawLine(midTop, center);
			graphics.drawLine(midBottom, center);
		}
	}

	private JType getJoinType() {
		if (this.transition instanceof Transition) {
			JoinType joinType = ((Transition) transition).getJoinType();
			if (joinType != null) {
				switch (joinType.getText().getValue()) {
				case JoinTypes.AN_DJOIN_VALUE:
					return JType.ANDjoin;
				}
			}
		}
		return JType.other;
	}

	private SType getSplitType() {
		if (this.transition instanceof Transition) {
			SplitType splitType = ((Transition) transition).getSplitType();
			if (splitType != null) {
				switch (splitType.getText().getValue()) {
				case SplitTypes.XO_RSPLIT_VALUE:
					return SType.XORsplit;
				}
			}
		}
		return SType.other;
	}

}
