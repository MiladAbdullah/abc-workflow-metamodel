/**
 */
package com.extremexp.emf.model.workflow.impl;

import com.extremexp.emf.model.workflow.DeployedWorkflow;
import com.extremexp.emf.model.workflow.ExperimentSpace;
import com.extremexp.emf.model.workflow.ParameterDomain;
import com.extremexp.emf.model.workflow.WorkflowPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.extremexp.emf.model.workflow.impl.ExperimentSpaceImpl#getDeployedworkflow <em>Deployedworkflow</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.impl.ExperimentSpaceImpl#getParameterdomain <em>Parameterdomain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentSpaceImpl extends MinimalEObjectImpl.Container implements ExperimentSpace {
	/**
	 * The cached value of the '{@link #getDeployedworkflow() <em>Deployedworkflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedworkflow()
	 * @generated
	 * @ordered
	 */
	protected DeployedWorkflow deployedworkflow;

	/**
	 * The cached value of the '{@link #getParameterdomain() <em>Parameterdomain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterdomain()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDomain> parameterdomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.EXPERIMENT_SPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedWorkflow getDeployedworkflow() {
		if (deployedworkflow != null && deployedworkflow.eIsProxy()) {
			InternalEObject oldDeployedworkflow = (InternalEObject) deployedworkflow;
			deployedworkflow = (DeployedWorkflow) eResolveProxy(oldDeployedworkflow);
			if (deployedworkflow != oldDeployedworkflow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WorkflowPackage.EXPERIMENT_SPACE__DEPLOYEDWORKFLOW, oldDeployedworkflow, deployedworkflow));
			}
		}
		return deployedworkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedWorkflow basicGetDeployedworkflow() {
		return deployedworkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployedworkflow(DeployedWorkflow newDeployedworkflow) {
		DeployedWorkflow oldDeployedworkflow = deployedworkflow;
		deployedworkflow = newDeployedworkflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.EXPERIMENT_SPACE__DEPLOYEDWORKFLOW,
					oldDeployedworkflow, deployedworkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDomain> getParameterdomain() {
		if (parameterdomain == null) {
			parameterdomain = new EObjectContainmentEList<ParameterDomain>(ParameterDomain.class, this,
					WorkflowPackage.EXPERIMENT_SPACE__PARAMETERDOMAIN);
		}
		return parameterdomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.EXPERIMENT_SPACE__PARAMETERDOMAIN:
			return ((InternalEList<?>) getParameterdomain()).basicRemove(otherEnd, msgs);
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
		case WorkflowPackage.EXPERIMENT_SPACE__DEPLOYEDWORKFLOW:
			if (resolve)
				return getDeployedworkflow();
			return basicGetDeployedworkflow();
		case WorkflowPackage.EXPERIMENT_SPACE__PARAMETERDOMAIN:
			return getParameterdomain();
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
		case WorkflowPackage.EXPERIMENT_SPACE__DEPLOYEDWORKFLOW:
			setDeployedworkflow((DeployedWorkflow) newValue);
			return;
		case WorkflowPackage.EXPERIMENT_SPACE__PARAMETERDOMAIN:
			getParameterdomain().clear();
			getParameterdomain().addAll((Collection<? extends ParameterDomain>) newValue);
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
		case WorkflowPackage.EXPERIMENT_SPACE__DEPLOYEDWORKFLOW:
			setDeployedworkflow((DeployedWorkflow) null);
			return;
		case WorkflowPackage.EXPERIMENT_SPACE__PARAMETERDOMAIN:
			getParameterdomain().clear();
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
		case WorkflowPackage.EXPERIMENT_SPACE__DEPLOYEDWORKFLOW:
			return deployedworkflow != null;
		case WorkflowPackage.EXPERIMENT_SPACE__PARAMETERDOMAIN:
			return parameterdomain != null && !parameterdomain.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExperimentSpaceImpl
