package dtu.mbse.groupi.yawl.graphics.figures;

import org.eclipse.swt.SWT;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;

import dtu.mbse.groupi.yawl.Arc;
import dtu.mbse.groupi.yawl.ArcType;
import dtu.mbse.groupi.yawl.ArcTypes;
import dtu.mbse.groupi.yawl.util.YawlFunctions;

public class YawlArcFigure extends ArcFigure {

	private Type type;
	private enum Type {
	    NORMAL, RESET
	}
	
	public YawlArcFigure(Arc arc) {
		super(arc);
		update();
	}
	
	@Override
	public void update() {
		type = getType();
		if (type == Type.RESET)
			this.setLineStyle(SWT.LINE_DASH);
		else
			this.setLineStyle(SWT.LINE_SOLID);
	}
	
	private Type getType() {
		if (this.arc instanceof Arc) {
			ArcType arcType = ((Arc) arc).getType();
			if (arcType != null && arcType.getText() == ArcTypes.RESET)
				return Type.RESET;
		}
		return Type.NORMAL;
	}

}