/**
 */
package com.extremexp.emf.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployed Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.extremexp.emf.model.workflow.DeployedWorkflow#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.DeployedWorkflow#getConfiguredtask <em>Configuredtask</em>}</li>
 * </ul>
 *
 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getDeployedWorkflow()
 * @model
 * @generated
 */
public interface DeployedWorkflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' reference.
	 * @see #setWorkflow(Workflow)
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getDeployedWorkflow_Workflow()
	 * @model
	 * @generated
	 */
	Workflow getWorkflow();

	/**
	 * Sets the value of the '{@link com.extremexp.emf.model.workflow.DeployedWorkflow#getWorkflow <em>Workflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	void setWorkflow(Workflow value);

	/**
	 * Returns the value of the '<em><b>Configuredtask</b></em>' containment reference list.
	 * The list contents are of type {@link com.extremexp.emf.model.workflow.ConfiguredTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuredtask</em>' containment reference list.
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getDeployedWorkflow_Configuredtask()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfiguredTask> getConfiguredtask();

} // DeployedWorkflow
