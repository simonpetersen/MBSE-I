/**
 */
package dtu.mbse.groupi.yawl;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtu.mbse.groupi.yawl.TransitionType#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see dtu.mbse.groupi.yawl.YawlPackage#getTransitionType()
 * @model
 * @generated
 */
public interface TransitionType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link dtu.mbse.groupi.yawl.TransitionTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see dtu.mbse.groupi.yawl.TransitionTypes
	 * @see #setText(TransitionTypes)
	 * @see dtu.mbse.groupi.yawl.YawlPackage#getTransitionType_Text()
	 * @model
	 * @generated
	 */
	TransitionTypes getText();

	/**
	 * Sets the value of the '{@link dtu.mbse.groupi.yawl.TransitionType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see dtu.mbse.groupi.yawl.TransitionTypes
	 * @see #getText()
	 * @generated
	 */
	void setText(TransitionTypes value);

} // TransitionType
