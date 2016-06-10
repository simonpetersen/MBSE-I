/**
 */
package dtu.mbse.groupi.yawlsimulator;

import org.eclipse.emf.common.util.EList;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enabled Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtu.mbse.groupi.yawlsimulator.EnabledTransition#getInArcs <em>In Arcs</em>}</li>
 *   <li>{@link dtu.mbse.groupi.yawlsimulator.EnabledTransition#getOutArcs <em>Out Arcs</em>}</li>
 * </ul>
 *
 * @see dtu.mbse.groupi.yawlsimulator.YawlsimulatorPackage#getEnabledTransition()
 * @model
 * @generated
 */
public interface EnabledTransition extends ObjectAnnotation {
	/**
	 * Returns the value of the '<em><b>In Arcs</b></em>' reference list.
	 * The list contents are of type {@link dtu.mbse.groupi.yawlsimulator.SelectArc}.
	 * It is bidirectional and its opposite is '{@link dtu.mbse.groupi.yawlsimulator.SelectArc#getTargetTransition <em>Target Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Arcs</em>' reference list.
	 * @see dtu.mbse.groupi.yawlsimulator.YawlsimulatorPackage#getEnabledTransition_InArcs()
	 * @see dtu.mbse.groupi.yawlsimulator.SelectArc#getTargetTransition
	 * @model opposite="targetTransition"
	 * @generated
	 */
	EList<SelectArc> getInArcs();

	/**
	 * Returns the value of the '<em><b>Out Arcs</b></em>' reference list.
	 * The list contents are of type {@link dtu.mbse.groupi.yawlsimulator.SelectArc}.
	 * It is bidirectional and its opposite is '{@link dtu.mbse.groupi.yawlsimulator.SelectArc#getSourceTransition <em>Source Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Arcs</em>' reference list.
	 * @see dtu.mbse.groupi.yawlsimulator.YawlsimulatorPackage#getEnabledTransition_OutArcs()
	 * @see dtu.mbse.groupi.yawlsimulator.SelectArc#getSourceTransition
	 * @model opposite="sourceTransition"
	 * @generated
	 */
	EList<SelectArc> getOutArcs();

} // EnabledTransition
