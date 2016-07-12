/**
 */
package dtu.mbse.groupi.yawlsimulator.impl;

import dtu.mbse.groupi.yawlsimulator.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YawlsimulatorFactoryImpl extends EFactoryImpl implements YawlsimulatorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YawlsimulatorFactory init() {
		try {
			YawlsimulatorFactory theYawlsimulatorFactory = (YawlsimulatorFactory)EPackage.Registry.INSTANCE.getEFactory(YawlsimulatorPackage.eNS_URI);
			if (theYawlsimulatorFactory != null) {
				return theYawlsimulatorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new YawlsimulatorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YawlsimulatorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case YawlsimulatorPackage.ENABLED_TRANSITION: return createEnabledTransition();
			case YawlsimulatorPackage.SELECT_ARC: return createSelectArc();
			case YawlsimulatorPackage.MARKING: return createMarking();
			case YawlsimulatorPackage.POSSIBLE_TOKEN: return createPossibleToken();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTransition createEnabledTransition() {
		EnabledTransitionImpl enabledTransition = new EnabledTransitionImpl();
		return enabledTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectArc createSelectArc() {
		SelectArcImpl selectArc = new SelectArcImpl();
		return selectArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking createMarking() {
		MarkingImpl marking = new MarkingImpl();
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibleToken createPossibleToken() {
		PossibleTokenImpl possibleToken = new PossibleTokenImpl();
		return possibleToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YawlsimulatorPackage getYawlsimulatorPackage() {
		return (YawlsimulatorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static YawlsimulatorPackage getPackage() {
		return YawlsimulatorPackage.eINSTANCE;
	}

} //YawlsimulatorFactoryImpl
