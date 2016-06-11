/**
 */
package dtu.mbse.groupi.yawl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import dtu.mbse.groupi.yawl.Arc;
import dtu.mbse.groupi.yawl.ArcType;
import dtu.mbse.groupi.yawl.ArcTypes;
import dtu.mbse.groupi.yawl.Place;
import dtu.mbse.groupi.yawl.PlaceType;
import dtu.mbse.groupi.yawl.PlaceTypes;
import dtu.mbse.groupi.yawl.Transition;
import dtu.mbse.groupi.yawl.TransitionType;
import dtu.mbse.groupi.yawl.TransitionTypes;
import dtu.mbse.groupi.yawl.YawlFactory;
import dtu.mbse.groupi.yawl.YawlNet;
import dtu.mbse.groupi.yawl.YawlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YawlPackageImpl extends EPackageImpl implements YawlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yawlNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arcTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum placeTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dtu.mbse.groupi.yawl.YawlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private YawlPackageImpl() {
		super(eNS_URI, YawlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link YawlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static YawlPackage init() {
		if (isInited) return (YawlPackage)EPackage.Registry.INSTANCE.getEPackage(YawlPackage.eNS_URI);

		// Obtain or create and register package
		YawlPackageImpl theYawlPackage = (YawlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof YawlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new YawlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PnmlcoremodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theYawlPackage.createPackageContents();

		// Initialize created meta-data
		theYawlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theYawlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(YawlPackage.eNS_URI, theYawlPackage);
		return theYawlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Type() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYawlNet() {
		return yawlNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_SplitType() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_JoinType() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Type() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcType() {
		return arcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcType_Text() {
		return (EAttribute)arcTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceType() {
		return placeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceType_Text() {
		return (EAttribute)placeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionType() {
		return transitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionType_Text() {
		return (EAttribute)transitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArcTypes() {
		return arcTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlaceTypes() {
		return placeTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitionTypes() {
		return transitionTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YawlFactory getYawlFactory() {
		return (YawlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__TYPE);

		yawlNetEClass = createEClass(YAWL_NET);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SPLIT_TYPE);
		createEReference(transitionEClass, TRANSITION__JOIN_TYPE);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__TYPE);

		arcTypeEClass = createEClass(ARC_TYPE);
		createEAttribute(arcTypeEClass, ARC_TYPE__TEXT);

		placeTypeEClass = createEClass(PLACE_TYPE);
		createEAttribute(placeTypeEClass, PLACE_TYPE__TEXT);

		transitionTypeEClass = createEClass(TRANSITION_TYPE);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__TEXT);

		// Create enums
		arcTypesEEnum = createEEnum(ARC_TYPES);
		placeTypesEEnum = createEEnum(PLACE_TYPES);
		transitionTypesEEnum = createEEnum(TRANSITION_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PnmlcoremodelPackage thePnmlcoremodelPackage = (PnmlcoremodelPackage)EPackage.Registry.INSTANCE.getEPackage(PnmlcoremodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		placeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPlace());
		yawlNetEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPetriNetType());
		transitionEClass.getESuperTypes().add(thePnmlcoremodelPackage.getTransition());
		arcEClass.getESuperTypes().add(thePnmlcoremodelPackage.getArc());
		arcTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		placeTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		transitionTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlace_Type(), this.getPlaceType(), null, "type", null, 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yawlNetEClass, YawlNet.class, "YawlNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_SplitType(), this.getTransitionType(), null, "splitType", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_JoinType(), this.getTransitionType(), null, "joinType", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Type(), this.getArcType(), null, "type", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcTypeEClass, ArcType.class, "ArcType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcType_Text(), this.getArcTypes(), "text", null, 0, 1, ArcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeTypeEClass, PlaceType.class, "PlaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceType_Text(), this.getPlaceTypes(), "text", null, 0, 1, PlaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionTypeEClass, TransitionType.class, "TransitionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionType_Text(), this.getTransitionTypes(), "text", null, 0, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(arcTypesEEnum, ArcTypes.class, "ArcTypes");
		addEEnumLiteral(arcTypesEEnum, ArcTypes.NORMAL);
		addEEnumLiteral(arcTypesEEnum, ArcTypes.RESET);

		initEEnum(placeTypesEEnum, PlaceTypes.class, "PlaceTypes");
		addEEnumLiteral(placeTypesEEnum, PlaceTypes.CONDITION);
		addEEnumLiteral(placeTypesEEnum, PlaceTypes.START);
		addEEnumLiteral(placeTypesEEnum, PlaceTypes.END);

		initEEnum(transitionTypesEEnum, TransitionTypes.class, "TransitionTypes");
		addEEnumLiteral(transitionTypesEEnum, TransitionTypes.SINGLE);
		addEEnumLiteral(transitionTypesEEnum, TransitionTypes.XOR);
		addEEnumLiteral(transitionTypesEEnum, TransitionTypes.OR);
		addEEnumLiteral(transitionTypesEEnum, TransitionTypes.AND);

		// Create resource
		createResource(eNS_URI);
	}

} //YawlPackageImpl
