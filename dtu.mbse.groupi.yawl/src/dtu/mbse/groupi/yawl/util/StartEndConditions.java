package dtu.mbse.groupi.yawl.util;

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import dtu.mbse.groupi.yawl.Place;
import dtu.mbse.groupi.yawl.PlaceTypes;
import dtu.mbse.groupi.yawl.impl.YawlNetImpl;

/**
 * 
 * @author Simon
 * @generated NOT
 */
public class StartEndConditions extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();

		if (object instanceof YawlNetImpl) {
			EObject container = object.eContainer();
			if (container instanceof PetriNet) {
				int startCount = 0;
				int endCount = 0;
				Iterator<EObject> iterator = container.eAllContents();
				while (iterator.hasNext()) {
					EObject content = iterator.next();
					if (content instanceof Place) {
						Place place = (Place) content;
						if (place.getIn().isEmpty() && !place.getOut().isEmpty()) startCount++;
						else if (place.getOut().isEmpty() && !place.getIn().isEmpty()) endCount++;
					}

				}
				if (startCount != 1 || endCount != 1) {
					// if there is not exactly one start place and exactly one
					// end place, return a failure status.
					return ctx.createFailureStatus(new Object[] { container });

				}

			}

		}
		// otherwise return a success status
		return ctx.createSuccessStatus();
	}

}
