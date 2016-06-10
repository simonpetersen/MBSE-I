/**
 */
package dtu.mbse.groupi.yawlsimulator;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtu.mbse.groupi.yawlsimulator.SelectArc#isSelected <em>Selected</em>}</li>
 *   <li>{@link dtu.mbse.groupi.yawlsimulator.SelectArc#getSourceTransition <em>Source Transition</em>}</li>
 *   <li>{@link dtu.mbse.groupi.yawlsimulator.SelectArc#getTargetTransition <em>Target Transition</em>}</li>
 * </ul>
 *
 * @see dtu.mbse.groupi.yawlsimulator.YawlsimulatorPackage#getSelectArc()
 * @model
 * @generated
 */
public interface SelectArc extends ObjectAnnotation {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see dtu.mbse.groupi.yawlsimulator.YawlsimulatorPackage#getSelectArc_Selected()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link dtu.mbse.groupi.yawlsimulator.SelectArc#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

	/**
	 * Returns the value of the '<em><b>Source Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dtu.mbse.groupi.yawlsimulator.EnabledTransition#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Transition</em>' reference.
	 * @see #setSourceTransition(EnabledTransition)
	 * @see dtu.mbse.groupi.yawlsimulator.YawlsimulatorPackage#getSelectArc_SourceTransition()
	 * @see dtu.mbse.groupi.yawlsimulator.EnabledTransition#getOutArcs
	 * @model opposite="outArcs"
	 * @generated
	 */
	EnabledTransition getSourceTransition();

	/**
	 * Sets the value of the '{@link dtu.mbse.groupi.yawlsimulator.SelectArc#getSourceTransition <em>Source Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Transition</em>' reference.
	 * @see #getSourceTransition()
	 * @generated
	 */
	void setSourceTransition(EnabledTransition value);

	/**
	 * Returns the value of the '<em><b>Target Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dtu.mbse.groupi.yawlsimulator.EnabledTransition#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Transition</em>' reference.
	 * @see #setTargetTransition(EnabledTransition)
	 * @see dtu.mbse.groupi.yawlsimulator.YawlsimulatorPackage#getSelectArc_TargetTransition()
	 * @see dtu.mbse.groupi.yawlsimulator.EnabledTransition#getInArcs
	 * @model opposite="inArcs"
	 * @generated
	 */
	EnabledTransition getTargetTransition();

	/**
	 * Sets the value of the '{@link dtu.mbse.groupi.yawlsimulator.SelectArc#getTargetTransition <em>Target Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Transition</em>' reference.
	 * @see #getTargetTransition()
	 * @generated
	 */
	void setTargetTransition(EnabledTransition value);

} // SelectArc
