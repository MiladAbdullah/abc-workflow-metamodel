/**
 */
package com.extremexp.emf.model.workflow.impl;

import com.extremexp.emf.model.workflow.ConfiguredTask;
import com.extremexp.emf.model.workflow.DeployedWorkflow;
import com.extremexp.emf.model.workflow.Workflow;
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
 * An implementation of the model object '<em><b>Deployed Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.extremexp.emf.model.workflow.impl.DeployedWorkflowImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.impl.DeployedWorkflowImpl#getConfiguredtask <em>Configuredtask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployedWorkflowImpl extends MinimalEObjectImpl.Container implements DeployedWorkflow {
	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected Workflow workflow;

	/**
	 * The cached value of the '{@link #getConfiguredtask() <em>Configuredtask</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguredtask()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfiguredTask> configuredtask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployedWorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.DEPLOYED_WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow getWorkflow() {
		if (workflow != null && workflow.eIsProxy()) {
			InternalEObject oldWorkflow = (InternalEObject) workflow;
			workflow = (Workflow) eResolveProxy(oldWorkflow);
			if (workflow != oldWorkflow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WorkflowPackage.DEPLOYED_WORKFLOW__WORKFLOW, oldWorkflow, workflow));
			}
		}
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow basicGetWorkflow() {
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflow(Workflow newWorkflow) {
		Workflow oldWorkflow = workflow;
		workflow = newWorkflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DEPLOYED_WORKFLOW__WORKFLOW,
					oldWorkflow, workflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfiguredTask> getConfiguredtask() {
		if (configuredtask == null) {
			configuredtask = new EObjectContainmentEList<ConfiguredTask>(ConfiguredTask.class, this,
					WorkflowPackage.DEPLOYED_WORKFLOW__CONFIGUREDTASK);
		}
		return configuredtask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.DEPLOYED_WORKFLOW__CONFIGUREDTASK:
			return ((InternalEList<?>) getConfiguredtask()).basicRemove(otherEnd, msgs);
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
		case WorkflowPackage.DEPLOYED_WORKFLOW__WORKFLOW:
			if (resolve)
				return getWorkflow();
			return basicGetWorkflow();
		case WorkflowPackage.DEPLOYED_WORKFLOW__CONFIGUREDTASK:
			return getConfiguredtask();
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
		case WorkflowPackage.DEPLOYED_WORKFLOW__WORKFLOW:
			setWorkflow((Workflow) newValue);
			return;
		case WorkflowPackage.DEPLOYED_WORKFLOW__CONFIGUREDTASK:
			getConfiguredtask().clear();
			getConfiguredtask().addAll((Collection<? extends ConfiguredTask>) newValue);
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
		case WorkflowPackage.DEPLOYED_WORKFLOW__WORKFLOW:
			setWorkflow((Workflow) null);
			return;
		case WorkflowPackage.DEPLOYED_WORKFLOW__CONFIGUREDTASK:
			getConfiguredtask().clear();
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
		case WorkflowPackage.DEPLOYED_WORKFLOW__WORKFLOW:
			return workflow != null;
		case WorkflowPackage.DEPLOYED_WORKFLOW__CONFIGUREDTASK:
			return configuredtask != null && !configuredtask.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeployedWorkflowImpl
