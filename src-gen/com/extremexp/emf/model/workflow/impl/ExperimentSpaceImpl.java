/**
 */
package com.extremexp.emf.model.workflow.impl;

import com.extremexp.emf.model.workflow.DeployedWorkflowParameterSpace;
import com.extremexp.emf.model.workflow.ExperimentSpace;
import com.extremexp.emf.model.workflow.WorkflowPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link com.extremexp.emf.model.workflow.impl.ExperimentSpaceImpl#getDeployedworkflowparameterspace <em>Deployedworkflowparameterspace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentSpaceImpl extends MinimalEObjectImpl.Container implements ExperimentSpace {
	/**
	 * The cached value of the '{@link #getDeployedworkflowparameterspace() <em>Deployedworkflowparameterspace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedworkflowparameterspace()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedWorkflowParameterSpace> deployedworkflowparameterspace;

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
	public EList<DeployedWorkflowParameterSpace> getDeployedworkflowparameterspace() {
		if (deployedworkflowparameterspace == null) {
			deployedworkflowparameterspace = new EObjectContainmentEList<DeployedWorkflowParameterSpace>(
					DeployedWorkflowParameterSpace.class, this,
					WorkflowPackage.EXPERIMENT_SPACE__DEPLOYEDWORKFLOWPARAMETERSPACE);
		}
		return deployedworkflowparameterspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.EXPERIMENT_SPACE__DEPLOYEDWORKFLOWPARAMETERSPACE:
			return ((InternalEList<?>) getDeployedworkflowparameterspace()).basicRemove(otherEnd, msgs);
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
		case WorkflowPackage.EXPERIMENT_SPACE__DEPLOYEDWORKFLOWPARAMETERSPACE:
			return getDeployedworkflowparameterspace();
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
		case WorkflowPackage.EXPERIMENT_SPACE__DEPLOYEDWORKFLOWPARAMETERSPACE:
			getDeployedworkflowparameterspace().clear();
			getDeployedworkflowparameterspace().addAll((Collection<? extends DeployedWorkflowParameterSpace>) newValue);
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
		case WorkflowPackage.EXPERIMENT_SPACE__DEPLOYEDWORKFLOWPARAMETERSPACE:
			getDeployedworkflowparameterspace().clear();
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
		case WorkflowPackage.EXPERIMENT_SPACE__DEPLOYEDWORKFLOWPARAMETERSPACE:
			return deployedworkflowparameterspace != null && !deployedworkflowparameterspace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExperimentSpaceImpl
