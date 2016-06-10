/**
 */
package dtu.mbse.groupi.yawlsimulator.impl;

import dtu.mbse.groupi.yawlsimulator.EnabledTransition;
import dtu.mbse.groupi.yawlsimulator.SelectArc;
import dtu.mbse.groupi.yawlsimulator.YawlsimulatorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.annotations.netannotations.impl.ObjectAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dtu.mbse.groupi.yawlsimulator.impl.SelectArcImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link dtu.mbse.groupi.yawlsimulator.impl.SelectArcImpl#getSourceTransition <em>Source Transition</em>}</li>
 *   <li>{@link dtu.mbse.groupi.yawlsimulator.impl.SelectArcImpl#getTargetTransition <em>Target Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectArcImpl extends ObjectAnnotationImpl implements SelectArc {
	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = SELECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceTransition() <em>Source Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTransition()
	 * @generated
	 * @ordered
	 */
	protected EnabledTransition sourceTransition;

	/**
	 * The cached value of the '{@link #getTargetTransition() <em>Target Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTransition()
	 * @generated
	 * @ordered
	 */
	protected EnabledTransition targetTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawlsimulatorPackage.Literals.SELECT_ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlsimulatorPackage.SELECT_ARC__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTransition getSourceTransition() {
		if (sourceTransition != null && sourceTransition.eIsProxy()) {
			InternalEObject oldSourceTransition = (InternalEObject)sourceTransition;
			sourceTransition = (EnabledTransition)eResolveProxy(oldSourceTransition);
			if (sourceTransition != oldSourceTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YawlsimulatorPackage.SELECT_ARC__SOURCE_TRANSITION, oldSourceTransition, sourceTransition));
			}
		}
		return sourceTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTransition basicGetSourceTransition() {
		return sourceTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceTransition(EnabledTransition newSourceTransition, NotificationChain msgs) {
		EnabledTransition oldSourceTransition = sourceTransition;
		sourceTransition = newSourceTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YawlsimulatorPackage.SELECT_ARC__SOURCE_TRANSITION, oldSourceTransition, newSourceTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTransition(EnabledTransition newSourceTransition) {
		if (newSourceTransition != sourceTransition) {
			NotificationChain msgs = null;
			if (sourceTransition != null)
				msgs = ((InternalEObject)sourceTransition).eInverseRemove(this, YawlsimulatorPackage.ENABLED_TRANSITION__OUT_ARCS, EnabledTransition.class, msgs);
			if (newSourceTransition != null)
				msgs = ((InternalEObject)newSourceTransition).eInverseAdd(this, YawlsimulatorPackage.ENABLED_TRANSITION__OUT_ARCS, EnabledTransition.class, msgs);
			msgs = basicSetSourceTransition(newSourceTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlsimulatorPackage.SELECT_ARC__SOURCE_TRANSITION, newSourceTransition, newSourceTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTransition getTargetTransition() {
		if (targetTransition != null && targetTransition.eIsProxy()) {
			InternalEObject oldTargetTransition = (InternalEObject)targetTransition;
			targetTransition = (EnabledTransition)eResolveProxy(oldTargetTransition);
			if (targetTransition != oldTargetTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YawlsimulatorPackage.SELECT_ARC__TARGET_TRANSITION, oldTargetTransition, targetTransition));
			}
		}
		return targetTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTransition basicGetTargetTransition() {
		return targetTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetTransition(EnabledTransition newTargetTransition, NotificationChain msgs) {
		EnabledTransition oldTargetTransition = targetTransition;
		targetTransition = newTargetTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YawlsimulatorPackage.SELECT_ARC__TARGET_TRANSITION, oldTargetTransition, newTargetTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTransition(EnabledTransition newTargetTransition) {
		if (newTargetTransition != targetTransition) {
			NotificationChain msgs = null;
			if (targetTransition != null)
				msgs = ((InternalEObject)targetTransition).eInverseRemove(this, YawlsimulatorPackage.ENABLED_TRANSITION__IN_ARCS, EnabledTransition.class, msgs);
			if (newTargetTransition != null)
				msgs = ((InternalEObject)newTargetTransition).eInverseAdd(this, YawlsimulatorPackage.ENABLED_TRANSITION__IN_ARCS, EnabledTransition.class, msgs);
			msgs = basicSetTargetTransition(newTargetTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlsimulatorPackage.SELECT_ARC__TARGET_TRANSITION, newTargetTransition, newTargetTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YawlsimulatorPackage.SELECT_ARC__SOURCE_TRANSITION:
				if (sourceTransition != null)
					msgs = ((InternalEObject)sourceTransition).eInverseRemove(this, YawlsimulatorPackage.ENABLED_TRANSITION__OUT_ARCS, EnabledTransition.class, msgs);
				return basicSetSourceTransition((EnabledTransition)otherEnd, msgs);
			case YawlsimulatorPackage.SELECT_ARC__TARGET_TRANSITION:
				if (targetTransition != null)
					msgs = ((InternalEObject)targetTransition).eInverseRemove(this, YawlsimulatorPackage.ENABLED_TRANSITION__IN_ARCS, EnabledTransition.class, msgs);
				return basicSetTargetTransition((EnabledTransition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YawlsimulatorPackage.SELECT_ARC__SOURCE_TRANSITION:
				return basicSetSourceTransition(null, msgs);
			case YawlsimulatorPackage.SELECT_ARC__TARGET_TRANSITION:
				return basicSetTargetTransition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YawlsimulatorPackage.SELECT_ARC__SELECTED:
				return isSelected();
			case YawlsimulatorPackage.SELECT_ARC__SOURCE_TRANSITION:
				if (resolve) return getSourceTransition();
				return basicGetSourceTransition();
			case YawlsimulatorPackage.SELECT_ARC__TARGET_TRANSITION:
				if (resolve) return getTargetTransition();
				return basicGetTargetTransition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case YawlsimulatorPackage.SELECT_ARC__SELECTED:
				setSelected((Boolean)newValue);
				return;
			case YawlsimulatorPackage.SELECT_ARC__SOURCE_TRANSITION:
				setSourceTransition((EnabledTransition)newValue);
				return;
			case YawlsimulatorPackage.SELECT_ARC__TARGET_TRANSITION:
				setTargetTransition((EnabledTransition)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case YawlsimulatorPackage.SELECT_ARC__SELECTED:
				setSelected(SELECTED_EDEFAULT);
				return;
			case YawlsimulatorPackage.SELECT_ARC__SOURCE_TRANSITION:
				setSourceTransition((EnabledTransition)null);
				return;
			case YawlsimulatorPackage.SELECT_ARC__TARGET_TRANSITION:
				setTargetTransition((EnabledTransition)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case YawlsimulatorPackage.SELECT_ARC__SELECTED:
				return selected != SELECTED_EDEFAULT;
			case YawlsimulatorPackage.SELECT_ARC__SOURCE_TRANSITION:
				return sourceTransition != null;
			case YawlsimulatorPackage.SELECT_ARC__TARGET_TRANSITION:
				return targetTransition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (selected: ");
		result.append(selected);
		result.append(')');
		return result.toString();
	}

} //SelectArcImpl
