/**
 */
package com.extremexp.emf.model.workflow.impl;

import com.extremexp.emf.model.workflow.ExternalInputData;
import com.extremexp.emf.model.workflow.WorkflowPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Input Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.extremexp.emf.model.workflow.impl.ExternalInputDataImpl#getEligibilityCondition <em>Eligibility Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalInputDataImpl extends InputDataImpl implements ExternalInputData {
	/**
	 * The default value of the '{@link #getEligibilityCondition() <em>Eligibility Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEligibilityCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String ELIGIBILITY_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEligibilityCondition() <em>Eligibility Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEligibilityCondition()
	 * @generated
	 * @ordered
	 */
	protected String eligibilityCondition = ELIGIBILITY_CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalInputDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.EXTERNAL_INPUT_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEligibilityCondition() {
		return eligibilityCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEligibilityCondition(String newEligibilityCondition) {
		String oldEligibilityCondition = eligibilityCondition;
		eligibilityCondition = newEligibilityCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WorkflowPackage.EXTERNAL_INPUT_DATA__ELIGIBILITY_CONDITION, oldEligibilityCondition,
					eligibilityCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.EXTERNAL_INPUT_DATA__ELIGIBILITY_CONDITION:
			return getEligibilityCondition();
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
		case WorkflowPackage.EXTERNAL_INPUT_DATA__ELIGIBILITY_CONDITION:
			setEligibilityCondition((String) newValue);
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
		case WorkflowPackage.EXTERNAL_INPUT_DATA__ELIGIBILITY_CONDITION:
			setEligibilityCondition(ELIGIBILITY_CONDITION_EDEFAULT);
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
		case WorkflowPackage.EXTERNAL_INPUT_DATA__ELIGIBILITY_CONDITION:
			return ELIGIBILITY_CONDITION_EDEFAULT == null ? eligibilityCondition != null
					: !ELIGIBILITY_CONDITION_EDEFAULT.equals(eligibilityCondition);
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
		result.append(" (eligibilityCondition: ");
		result.append(eligibilityCondition);
		result.append(')');
		return result.toString();
	}

} //ExternalInputDataImpl
