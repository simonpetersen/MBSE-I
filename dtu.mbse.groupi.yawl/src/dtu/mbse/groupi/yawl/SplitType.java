/**
 */
package dtu.mbse.groupi.yawl;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtu.mbse.groupi.yawl.SplitType#getText <em>Text</em>}</li>
 *   <li>{@link dtu.mbse.groupi.yawl.SplitType#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see dtu.mbse.groupi.yawl.YawlPackage#getSplitType()
 * @model
 * @generated
 */
public interface SplitType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link dtu.mbse.groupi.yawl.SplitTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see dtu.mbse.groupi.yawl.SplitTypes
	 * @see #setText(SplitTypes)
	 * @see dtu.mbse.groupi.yawl.YawlPackage#getSplitType_Text()
	 * @model
	 * @generated
	 */
	SplitTypes getText();

	/**
	 * Sets the value of the '{@link dtu.mbse.groupi.yawl.SplitType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see dtu.mbse.groupi.yawl.SplitTypes
	 * @see #getText()
	 * @generated
	 */
	void setText(SplitTypes value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dtu.mbse.groupi.yawl.Transition#getSplitType <em>Split Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' container reference.
	 * @see #setTransition(Transition)
	 * @see dtu.mbse.groupi.yawl.YawlPackage#getSplitType_Transition()
	 * @see dtu.mbse.groupi.yawl.Transition#getSplitType
	 * @model opposite="splitType" transient="false"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link dtu.mbse.groupi.yawl.SplitType#getTransition <em>Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' container reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // SplitType
