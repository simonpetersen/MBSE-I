/**
 */
package dtu.mbse.groupi.yawl;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtu.mbse.groupi.yawl.ArcType#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see dtu.mbse.groupi.yawl.YawlPackage#getArcType()
 * @model
 * @generated
 */
public interface ArcType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link dtu.mbse.groupi.yawl.ArcTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see dtu.mbse.groupi.yawl.ArcTypes
	 * @see #setText(ArcTypes)
	 * @see dtu.mbse.groupi.yawl.YawlPackage#getArcType_Text()
	 * @model
	 * @generated
	 */
	ArcTypes getText();

	/**
	 * Sets the value of the '{@link dtu.mbse.groupi.yawl.ArcType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see dtu.mbse.groupi.yawl.ArcTypes
	 * @see #getText()
	 * @generated
	 */
	void setText(ArcTypes value);

} // ArcType
