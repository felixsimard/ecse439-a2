/**
 */
package hal.impl;

import hal.AtomicRelationalTerm;
import hal.ComparisonOperator;
import hal.Device;
import hal.HalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Relational Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hal.impl.AtomicRelationalTermImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link hal.impl.AtomicRelationalTermImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link hal.impl.AtomicRelationalTermImpl#getComparedAgainstValue <em>Compared Against Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicRelationalTermImpl extends BooleanExpressionImpl implements AtomicRelationalTerm {
	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected Device sensor;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator OPERATOR_EDEFAULT = ComparisonOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getComparedAgainstValue() <em>Compared Against Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparedAgainstValue()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARED_AGAINST_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparedAgainstValue() <em>Compared Against Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparedAgainstValue()
	 * @generated
	 * @ordered
	 */
	protected String comparedAgainstValue = COMPARED_AGAINST_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicRelationalTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ATOMIC_RELATIONAL_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getSensor() {
		if (sensor != null && sensor.eIsProxy()) {
			InternalEObject oldSensor = (InternalEObject) sensor;
			sensor = (Device) eResolveProxy(oldSensor);
			if (sensor != oldSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ATOMIC_RELATIONAL_TERM__SENSOR,
							oldSensor, sensor));
			}
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(Device newSensor) {
		Device oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ATOMIC_RELATIONAL_TERM__SENSOR, oldSensor,
					sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ComparisonOperator newOperator) {
		ComparisonOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ATOMIC_RELATIONAL_TERM__OPERATOR,
					oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComparedAgainstValue() {
		return comparedAgainstValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparedAgainstValue(String newComparedAgainstValue) {
		String oldComparedAgainstValue = comparedAgainstValue;
		comparedAgainstValue = newComparedAgainstValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					HalPackage.ATOMIC_RELATIONAL_TERM__COMPARED_AGAINST_VALUE, oldComparedAgainstValue,
					comparedAgainstValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HalPackage.ATOMIC_RELATIONAL_TERM__SENSOR:
			if (resolve)
				return getSensor();
			return basicGetSensor();
		case HalPackage.ATOMIC_RELATIONAL_TERM__OPERATOR:
			return getOperator();
		case HalPackage.ATOMIC_RELATIONAL_TERM__COMPARED_AGAINST_VALUE:
			return getComparedAgainstValue();
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
		case HalPackage.ATOMIC_RELATIONAL_TERM__SENSOR:
			setSensor((Device) newValue);
			return;
		case HalPackage.ATOMIC_RELATIONAL_TERM__OPERATOR:
			setOperator((ComparisonOperator) newValue);
			return;
		case HalPackage.ATOMIC_RELATIONAL_TERM__COMPARED_AGAINST_VALUE:
			setComparedAgainstValue((String) newValue);
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
		case HalPackage.ATOMIC_RELATIONAL_TERM__SENSOR:
			setSensor((Device) null);
			return;
		case HalPackage.ATOMIC_RELATIONAL_TERM__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case HalPackage.ATOMIC_RELATIONAL_TERM__COMPARED_AGAINST_VALUE:
			setComparedAgainstValue(COMPARED_AGAINST_VALUE_EDEFAULT);
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
		case HalPackage.ATOMIC_RELATIONAL_TERM__SENSOR:
			return sensor != null;
		case HalPackage.ATOMIC_RELATIONAL_TERM__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
		case HalPackage.ATOMIC_RELATIONAL_TERM__COMPARED_AGAINST_VALUE:
			return COMPARED_AGAINST_VALUE_EDEFAULT == null ? comparedAgainstValue != null
					: !COMPARED_AGAINST_VALUE_EDEFAULT.equals(comparedAgainstValue);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(", comparedAgainstValue: ");
		result.append(comparedAgainstValue);
		result.append(')');
		return result.toString();
	}

} //AtomicRelationalTermImpl
