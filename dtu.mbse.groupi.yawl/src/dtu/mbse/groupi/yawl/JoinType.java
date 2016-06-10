/**
 */
package dtu.mbse.groupi.yawl;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtu.mbse.groupi.yawl.JoinType#getText <em>Text</em>}</li>
 *   <li>{@link dtu.mbse.groupi.yawl.JoinType#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see dtu.mbse.groupi.yawl.YawlPackage#getJoinType()
 * @model
 * @generated
 */
public interface JoinType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link dtu.mbse.groupi.yawl.JoinTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see dtu.mbse.groupi.yawl.JoinTypes
	 * @see #setText(JoinTypes)
	 * @see dtu.mbse.groupi.yawl.YawlPackage#getJoinType_Text()
	 * @model
	 * @generated
	 */
	JoinTypes getText();

	/**
	 * Sets the value of the '{@link dtu.mbse.groupi.yawl.JoinType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see dtu.mbse.groupi.yawl.JoinTypes
	 * @see #getText()
	 * @generated
	 */
	void setText(JoinTypes value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dtu.mbse.groupi.yawl.Transition#getJoinType <em>Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' container reference.
	 * @see #setTransition(Transition)
	 * @see dtu.mbse.groupi.yawl.YawlPackage#getJoinType_Transition()
	 * @see dtu.mbse.groupi.yawl.Transition#getJoinType
	 * @model opposite="joinType" transient="false"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link dtu.mbse.groupi.yawl.JoinType#getTransition <em>Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' container reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // JoinType
