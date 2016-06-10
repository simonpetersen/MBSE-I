/**
 */
package dtu.mbse.groupi.yawl.impl;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl;

import dtu.mbse.groupi.yawl.YawlNet;
import dtu.mbse.groupi.yawl.YawlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class YawlNetImpl extends PetriNetTypeImpl implements YawlNet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public YawlNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawlPackage.Literals.YAWL_NET;
	}

	@Override
	public String toString() {
		return "http://mbse-f16.groupi.dtu.dk/yawl";
	}

} //YawlNetImpl
