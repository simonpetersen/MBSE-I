/**
 */
package dtu.mbse.groupi.yawlsimulator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pnml.tools.epnk.annotations.netannotations.Annotation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.impl.TextualAnnotationImpl;

import dtu.mbse.groupi.yawlsimulator.Marking;
import dtu.mbse.groupi.yawlsimulator.YawlsimulatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dtu.mbse.groupi.yawlsimulator.impl.MarkingImpl#getNetAnnotations <em>Net Annotations</em>}</li>
 *   <li>{@link dtu.mbse.groupi.yawlsimulator.impl.MarkingImpl#getObject <em>Object</em>}</li>
 *   <li>{@link dtu.mbse.groupi.yawlsimulator.impl.MarkingImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkingImpl extends TextualAnnotationImpl implements Marking {
	/**
	 * The cached value of the '{@link #getNetAnnotations() <em>Net Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<NetAnnotation> netAnnotations;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected org.pnml.tools.epnk.pnmlcoremodel.Object object;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawlsimulatorPackage.Literals.MARKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetAnnotation> getNetAnnotations() {
		if (netAnnotations == null) {
			netAnnotations = new EObjectWithInverseResolvingEList.ManyInverse<NetAnnotation>(NetAnnotation.class, this, YawlsimulatorPackage.MARKING__NET_ANNOTATIONS, NetannotationsPackage.NET_ANNOTATION__OBJECT_ANNOTATIONS);
		}
		return netAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.pnml.tools.epnk.pnmlcoremodel.Object getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject)object;
			object = (org.pnml.tools.epnk.pnmlcoremodel.Object)eResolveProxy(oldObject);
			if (object != oldObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YawlsimulatorPackage.MARKING__OBJECT, oldObject, object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.pnml.tools.epnk.pnmlcoremodel.Object basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(org.pnml.tools.epnk.pnmlcoremodel.Object newObject) {
		org.pnml.tools.epnk.pnmlcoremodel.Object oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlsimulatorPackage.MARKING__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlsimulatorPackage.MARKING__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YawlsimulatorPackage.MARKING__NET_ANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNetAnnotations()).basicAdd(otherEnd, msgs);
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
			case YawlsimulatorPackage.MARKING__NET_ANNOTATIONS:
				return ((InternalEList<?>)getNetAnnotations()).basicRemove(otherEnd, msgs);
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
			case YawlsimulatorPackage.MARKING__NET_ANNOTATIONS:
				return getNetAnnotations();
			case YawlsimulatorPackage.MARKING__OBJECT:
				if (resolve) return getObject();
				return basicGetObject();
			case YawlsimulatorPackage.MARKING__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case YawlsimulatorPackage.MARKING__NET_ANNOTATIONS:
				getNetAnnotations().clear();
				getNetAnnotations().addAll((Collection<? extends NetAnnotation>)newValue);
				return;
			case YawlsimulatorPackage.MARKING__OBJECT:
				setObject((org.pnml.tools.epnk.pnmlcoremodel.Object)newValue);
				return;
			case YawlsimulatorPackage.MARKING__VALUE:
				setValue((Integer)newValue);
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
			case YawlsimulatorPackage.MARKING__NET_ANNOTATIONS:
				getNetAnnotations().clear();
				return;
			case YawlsimulatorPackage.MARKING__OBJECT:
				setObject((org.pnml.tools.epnk.pnmlcoremodel.Object)null);
				return;
			case YawlsimulatorPackage.MARKING__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case YawlsimulatorPackage.MARKING__NET_ANNOTATIONS:
				return netAnnotations != null && !netAnnotations.isEmpty();
			case YawlsimulatorPackage.MARKING__OBJECT:
				return object != null;
			case YawlsimulatorPackage.MARKING__VALUE:
				return value != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Annotation.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ObjectAnnotation.class) {
			switch (derivedFeatureID) {
				case YawlsimulatorPackage.MARKING__NET_ANNOTATIONS: return NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;
				case YawlsimulatorPackage.MARKING__OBJECT: return NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Annotation.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ObjectAnnotation.class) {
			switch (baseFeatureID) {
				case NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS: return YawlsimulatorPackage.MARKING__NET_ANNOTATIONS;
				case NetannotationsPackage.OBJECT_ANNOTATION__OBJECT: return YawlsimulatorPackage.MARKING__OBJECT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public EAttribute getAnnotationAttribute() {
		return YawlsimulatorPackage.eINSTANCE.getMarking_Value();
	}

} //MarkingImpl
