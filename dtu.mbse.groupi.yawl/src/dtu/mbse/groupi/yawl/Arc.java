/**
 */
package dtu.mbse.groupi.yawl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtu.mbse.groupi.yawl.Arc#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see dtu.mbse.groupi.yawl.YawlPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends org.pnml.tools.epnk.pnmlcoremodel.Arc {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ArcType)
	 * @see dtu.mbse.groupi.yawl.YawlPackage#getArc_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArcType getType();

	/**
	 * Sets the value of the '{@link dtu.mbse.groupi.yawl.Arc#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ArcType value);

} // Arc
