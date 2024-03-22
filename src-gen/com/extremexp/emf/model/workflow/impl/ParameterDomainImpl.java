/**
 */
package com.extremexp.emf.model.workflow.impl;

import com.extremexp.emf.model.workflow.ParameterDomain;
import com.extremexp.emf.model.workflow.StaticParameter;
import com.extremexp.emf.model.workflow.WorkflowPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.extremexp.emf.model.workflow.impl.ParameterDomainImpl#getStaticparameter <em>Staticparameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterDomainImpl extends StaticParameterImpl implements ParameterDomain {
	/**
	 * The cached value of the '{@link #getStaticparameter() <em>Staticparameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticparameter()
	 * @generated
	 * @ordered
	 */
	protected StaticParameter staticparameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.PARAMETER_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticParameter getStaticparameter() {
		if (staticparameter != null && staticparameter.eIsProxy()) {
			InternalEObject oldStaticparameter = (InternalEObject) staticparameter;
			staticparameter = (StaticParameter) eResolveProxy(oldStaticparameter);
			if (staticparameter != oldStaticparameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WorkflowPackage.PARAMETER_DOMAIN__STATICPARAMETER, oldStaticparameter, staticparameter));
			}
		}
		return staticparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticParameter basicGetStaticparameter() {
		return staticparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticparameter(StaticParameter newStaticparameter) {
		StaticParameter oldStaticparameter = staticparameter;
		staticparameter = newStaticparameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.PARAMETER_DOMAIN__STATICPARAMETER,
					oldStaticparameter, staticparameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.PARAMETER_DOMAIN__STATICPARAMETER:
			if (resolve)
				return getStaticparameter();
			return basicGetStaticparameter();
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
		case WorkflowPackage.PARAMETER_DOMAIN__STATICPARAMETER:
			setStaticparameter((StaticParameter) newValue);
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
		case WorkflowPackage.PARAMETER_DOMAIN__STATICPARAMETER:
			setStaticparameter((StaticParameter) null);
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
		case WorkflowPackage.PARAMETER_DOMAIN__STATICPARAMETER:
			return staticparameter != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterDomainImpl
