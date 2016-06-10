/**
 */
package dtu.mbse.groupi.yawl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dtu.mbse.groupi.yawl.YawlFactory
 * @model kind="package"
 * @generated
 */
public interface YawlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "yawl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/yawl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "yawl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YawlPackage eINSTANCE = dtu.mbse.groupi.yawl.impl.YawlPackageImpl.init();

	/**
	 * The meta object id for the '{@link dtu.mbse.groupi.yawl.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtu.mbse.groupi.yawl.impl.PlaceImpl
	 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ID = PnmlcoremodelPackage.PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = PnmlcoremodelPackage.PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOOLSPECIFIC = PnmlcoremodelPackage.PLACE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__GRAPHICS = PnmlcoremodelPackage.PLACE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__UNKNOWN = PnmlcoremodelPackage.PLACE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OUT = PnmlcoremodelPackage.PLACE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__IN = PnmlcoremodelPackage.PLACE__IN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TYPE = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dtu.mbse.groupi.yawl.impl.YawlNetImpl <em>Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtu.mbse.groupi.yawl.impl.YawlNetImpl
	 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getYawlNet()
	 * @generated
	 */
	int YAWL_NET = 1;

	/**
	 * The number of structural features of the '<em>Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAWL_NET_FEATURE_COUNT = PnmlcoremodelPackage.PETRI_NET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtu.mbse.groupi.yawl.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtu.mbse.groupi.yawl.impl.TransitionImpl
	 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = PnmlcoremodelPackage.TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = PnmlcoremodelPackage.TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TOOLSPECIFIC = PnmlcoremodelPackage.TRANSITION__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GRAPHICS = PnmlcoremodelPackage.TRANSITION__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__UNKNOWN = PnmlcoremodelPackage.TRANSITION__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUT = PnmlcoremodelPackage.TRANSITION__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IN = PnmlcoremodelPackage.TRANSITION__IN;

	/**
	 * The feature id for the '<em><b>Split Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SPLIT_TYPE = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__JOIN_TYPE = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dtu.mbse.groupi.yawl.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtu.mbse.groupi.yawl.impl.ArcImpl
	 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ID = PnmlcoremodelPackage.ARC__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = PnmlcoremodelPackage.ARC__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TOOLSPECIFIC = PnmlcoremodelPackage.ARC__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__GRAPHICS = PnmlcoremodelPackage.ARC__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__UNKNOWN = PnmlcoremodelPackage.ARC__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = PnmlcoremodelPackage.ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = PnmlcoremodelPackage.ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TYPE = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dtu.mbse.groupi.yawl.impl.ArcTypeImpl <em>Arc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtu.mbse.groupi.yawl.impl.ArcTypeImpl
	 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getArcType()
	 * @generated
	 */
	int ARC_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TEXT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__ARC = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dtu.mbse.groupi.yawl.impl.PlaceTypeImpl <em>Place Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtu.mbse.groupi.yawl.impl.PlaceTypeImpl
	 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getPlaceType()
	 * @generated
	 */
	int PLACE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__TEXT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Place</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__PLACE = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dtu.mbse.groupi.yawl.impl.SplitTypeImpl <em>Split Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtu.mbse.groupi.yawl.impl.SplitTypeImpl
	 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getSplitType()
	 * @generated
	 */
	int SPLIT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_TYPE__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_TYPE__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_TYPE__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_TYPE__TEXT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_TYPE__TRANSITION = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Split Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_TYPE_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dtu.mbse.groupi.yawl.impl.JoinTypeImpl <em>Join Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtu.mbse.groupi.yawl.impl.JoinTypeImpl
	 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getJoinType()
	 * @generated
	 */
	int JOIN_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__TEXT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__TRANSITION = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dtu.mbse.groupi.yawl.ArcTypes <em>Arc Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtu.mbse.groupi.yawl.ArcTypes
	 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getArcTypes()
	 * @generated
	 */
	int ARC_TYPES = 8;

	/**
	 * The meta object id for the '{@link dtu.mbse.groupi.yawl.PlaceTypes <em>Place Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtu.mbse.groupi.yawl.PlaceTypes
	 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getPlaceTypes()
	 * @generated
	 */
	int PLACE_TYPES = 9;

	/**
	 * The meta object id for the '{@link dtu.mbse.groupi.yawl.SplitTypes <em>Split Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtu.mbse.groupi.yawl.SplitTypes
	 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getSplitTypes()
	 * @generated
	 */
	int SPLIT_TYPES = 10;

	/**
	 * The meta object id for the '{@link dtu.mbse.groupi.yawl.JoinTypes <em>Join Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtu.mbse.groupi.yawl.JoinTypes
	 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getJoinTypes()
	 * @generated
	 */
	int JOIN_TYPES = 11;

	/**
	 * Returns the meta object for class '{@link dtu.mbse.groupi.yawl.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see dtu.mbse.groupi.yawl.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the containment reference '{@link dtu.mbse.groupi.yawl.Place#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see dtu.mbse.groupi.yawl.Place#getType()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Type();

	/**
	 * Returns the meta object for class '{@link dtu.mbse.groupi.yawl.YawlNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net</em>'.
	 * @see dtu.mbse.groupi.yawl.YawlNet
	 * @generated
	 */
	EClass getYawlNet();

	/**
	 * Returns the meta object for class '{@link dtu.mbse.groupi.yawl.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see dtu.mbse.groupi.yawl.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link dtu.mbse.groupi.yawl.Transition#getSplitType <em>Split Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Split Type</em>'.
	 * @see dtu.mbse.groupi.yawl.Transition#getSplitType()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_SplitType();

	/**
	 * Returns the meta object for the containment reference '{@link dtu.mbse.groupi.yawl.Transition#getJoinType <em>Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Type</em>'.
	 * @see dtu.mbse.groupi.yawl.Transition#getJoinType()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_JoinType();

	/**
	 * Returns the meta object for class '{@link dtu.mbse.groupi.yawl.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see dtu.mbse.groupi.yawl.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the containment reference '{@link dtu.mbse.groupi.yawl.Arc#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see dtu.mbse.groupi.yawl.Arc#getType()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Type();

	/**
	 * Returns the meta object for class '{@link dtu.mbse.groupi.yawl.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Type</em>'.
	 * @see dtu.mbse.groupi.yawl.ArcType
	 * @generated
	 */
	EClass getArcType();

	/**
	 * Returns the meta object for the attribute '{@link dtu.mbse.groupi.yawl.ArcType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dtu.mbse.groupi.yawl.ArcType#getText()
	 * @see #getArcType()
	 * @generated
	 */
	EAttribute getArcType_Text();

	/**
	 * Returns the meta object for the container reference '{@link dtu.mbse.groupi.yawl.ArcType#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Arc</em>'.
	 * @see dtu.mbse.groupi.yawl.ArcType#getArc()
	 * @see #getArcType()
	 * @generated
	 */
	EReference getArcType_Arc();

	/**
	 * Returns the meta object for class '{@link dtu.mbse.groupi.yawl.PlaceType <em>Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Type</em>'.
	 * @see dtu.mbse.groupi.yawl.PlaceType
	 * @generated
	 */
	EClass getPlaceType();

	/**
	 * Returns the meta object for the attribute '{@link dtu.mbse.groupi.yawl.PlaceType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dtu.mbse.groupi.yawl.PlaceType#getText()
	 * @see #getPlaceType()
	 * @generated
	 */
	EAttribute getPlaceType_Text();

	/**
	 * Returns the meta object for the container reference '{@link dtu.mbse.groupi.yawl.PlaceType#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Place</em>'.
	 * @see dtu.mbse.groupi.yawl.PlaceType#getPlace()
	 * @see #getPlaceType()
	 * @generated
	 */
	EReference getPlaceType_Place();

	/**
	 * Returns the meta object for class '{@link dtu.mbse.groupi.yawl.SplitType <em>Split Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Type</em>'.
	 * @see dtu.mbse.groupi.yawl.SplitType
	 * @generated
	 */
	EClass getSplitType();

	/**
	 * Returns the meta object for the attribute '{@link dtu.mbse.groupi.yawl.SplitType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dtu.mbse.groupi.yawl.SplitType#getText()
	 * @see #getSplitType()
	 * @generated
	 */
	EAttribute getSplitType_Text();

	/**
	 * Returns the meta object for the container reference '{@link dtu.mbse.groupi.yawl.SplitType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transition</em>'.
	 * @see dtu.mbse.groupi.yawl.SplitType#getTransition()
	 * @see #getSplitType()
	 * @generated
	 */
	EReference getSplitType_Transition();

	/**
	 * Returns the meta object for class '{@link dtu.mbse.groupi.yawl.JoinType <em>Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Type</em>'.
	 * @see dtu.mbse.groupi.yawl.JoinType
	 * @generated
	 */
	EClass getJoinType();

	/**
	 * Returns the meta object for the attribute '{@link dtu.mbse.groupi.yawl.JoinType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dtu.mbse.groupi.yawl.JoinType#getText()
	 * @see #getJoinType()
	 * @generated
	 */
	EAttribute getJoinType_Text();

	/**
	 * Returns the meta object for the container reference '{@link dtu.mbse.groupi.yawl.JoinType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transition</em>'.
	 * @see dtu.mbse.groupi.yawl.JoinType#getTransition()
	 * @see #getJoinType()
	 * @generated
	 */
	EReference getJoinType_Transition();

	/**
	 * Returns the meta object for enum '{@link dtu.mbse.groupi.yawl.ArcTypes <em>Arc Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arc Types</em>'.
	 * @see dtu.mbse.groupi.yawl.ArcTypes
	 * @generated
	 */
	EEnum getArcTypes();

	/**
	 * Returns the meta object for enum '{@link dtu.mbse.groupi.yawl.PlaceTypes <em>Place Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Place Types</em>'.
	 * @see dtu.mbse.groupi.yawl.PlaceTypes
	 * @generated
	 */
	EEnum getPlaceTypes();

	/**
	 * Returns the meta object for enum '{@link dtu.mbse.groupi.yawl.SplitTypes <em>Split Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Split Types</em>'.
	 * @see dtu.mbse.groupi.yawl.SplitTypes
	 * @generated
	 */
	EEnum getSplitTypes();

	/**
	 * Returns the meta object for enum '{@link dtu.mbse.groupi.yawl.JoinTypes <em>Join Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Join Types</em>'.
	 * @see dtu.mbse.groupi.yawl.JoinTypes
	 * @generated
	 */
	EEnum getJoinTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	YawlFactory getYawlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dtu.mbse.groupi.yawl.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtu.mbse.groupi.yawl.impl.PlaceImpl
		 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__TYPE = eINSTANCE.getPlace_Type();

		/**
		 * The meta object literal for the '{@link dtu.mbse.groupi.yawl.impl.YawlNetImpl <em>Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtu.mbse.groupi.yawl.impl.YawlNetImpl
		 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getYawlNet()
		 * @generated
		 */
		EClass YAWL_NET = eINSTANCE.getYawlNet();

		/**
		 * The meta object literal for the '{@link dtu.mbse.groupi.yawl.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtu.mbse.groupi.yawl.impl.TransitionImpl
		 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Split Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SPLIT_TYPE = eINSTANCE.getTransition_SplitType();

		/**
		 * The meta object literal for the '<em><b>Join Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__JOIN_TYPE = eINSTANCE.getTransition_JoinType();

		/**
		 * The meta object literal for the '{@link dtu.mbse.groupi.yawl.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtu.mbse.groupi.yawl.impl.ArcImpl
		 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TYPE = eINSTANCE.getArc_Type();

		/**
		 * The meta object literal for the '{@link dtu.mbse.groupi.yawl.impl.ArcTypeImpl <em>Arc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtu.mbse.groupi.yawl.impl.ArcTypeImpl
		 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getArcType()
		 * @generated
		 */
		EClass ARC_TYPE = eINSTANCE.getArcType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_TYPE__TEXT = eINSTANCE.getArcType_Text();

		/**
		 * The meta object literal for the '<em><b>Arc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_TYPE__ARC = eINSTANCE.getArcType_Arc();

		/**
		 * The meta object literal for the '{@link dtu.mbse.groupi.yawl.impl.PlaceTypeImpl <em>Place Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtu.mbse.groupi.yawl.impl.PlaceTypeImpl
		 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getPlaceType()
		 * @generated
		 */
		EClass PLACE_TYPE = eINSTANCE.getPlaceType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_TYPE__TEXT = eINSTANCE.getPlaceType_Text();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_TYPE__PLACE = eINSTANCE.getPlaceType_Place();

		/**
		 * The meta object literal for the '{@link dtu.mbse.groupi.yawl.impl.SplitTypeImpl <em>Split Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtu.mbse.groupi.yawl.impl.SplitTypeImpl
		 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getSplitType()
		 * @generated
		 */
		EClass SPLIT_TYPE = eINSTANCE.getSplitType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLIT_TYPE__TEXT = eINSTANCE.getSplitType_Text();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_TYPE__TRANSITION = eINSTANCE.getSplitType_Transition();

		/**
		 * The meta object literal for the '{@link dtu.mbse.groupi.yawl.impl.JoinTypeImpl <em>Join Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtu.mbse.groupi.yawl.impl.JoinTypeImpl
		 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getJoinType()
		 * @generated
		 */
		EClass JOIN_TYPE = eINSTANCE.getJoinType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TYPE__TEXT = eINSTANCE.getJoinType_Text();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_TYPE__TRANSITION = eINSTANCE.getJoinType_Transition();

		/**
		 * The meta object literal for the '{@link dtu.mbse.groupi.yawl.ArcTypes <em>Arc Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtu.mbse.groupi.yawl.ArcTypes
		 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getArcTypes()
		 * @generated
		 */
		EEnum ARC_TYPES = eINSTANCE.getArcTypes();

		/**
		 * The meta object literal for the '{@link dtu.mbse.groupi.yawl.PlaceTypes <em>Place Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtu.mbse.groupi.yawl.PlaceTypes
		 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getPlaceTypes()
		 * @generated
		 */
		EEnum PLACE_TYPES = eINSTANCE.getPlaceTypes();

		/**
		 * The meta object literal for the '{@link dtu.mbse.groupi.yawl.SplitTypes <em>Split Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtu.mbse.groupi.yawl.SplitTypes
		 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getSplitTypes()
		 * @generated
		 */
		EEnum SPLIT_TYPES = eINSTANCE.getSplitTypes();

		/**
		 * The meta object literal for the '{@link dtu.mbse.groupi.yawl.JoinTypes <em>Join Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtu.mbse.groupi.yawl.JoinTypes
		 * @see dtu.mbse.groupi.yawl.impl.YawlPackageImpl#getJoinTypes()
		 * @generated
		 */
		EEnum JOIN_TYPES = eINSTANCE.getJoinTypes();

	}

} //YawlPackage
