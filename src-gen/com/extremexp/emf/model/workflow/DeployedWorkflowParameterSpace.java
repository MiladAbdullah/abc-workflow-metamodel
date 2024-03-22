/**
 */
package com.extremexp.emf.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployed Workflow Parameter Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.extremexp.emf.model.workflow.DeployedWorkflowParameterSpace#getMethod <em>Method</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.DeployedWorkflowParameterSpace#getDeployedworkflow <em>Deployedworkflow</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.DeployedWorkflowParameterSpace#getParameterdomain <em>Parameterdomain</em>}</li>
 * </ul>
 *
 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getDeployedWorkflowParameterSpace()
 * @model
 * @generated
 */
public interface DeployedWorkflowParameterSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getDeployedWorkflowParameterSpace_Method()
	 * @model
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link com.extremexp.emf.model.workflow.DeployedWorkflowParameterSpace#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Deployedworkflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployedworkflow</em>' reference.
	 * @see #setDeployedworkflow(DeployedWorkflow)
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getDeployedWorkflowParameterSpace_Deployedworkflow()
	 * @model
	 * @generated
	 */
	DeployedWorkflow getDeployedworkflow();

	/**
	 * Sets the value of the '{@link com.extremexp.emf.model.workflow.DeployedWorkflowParameterSpace#getDeployedworkflow <em>Deployedworkflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployedworkflow</em>' reference.
	 * @see #getDeployedworkflow()
	 * @generated
	 */
	void setDeployedworkflow(DeployedWorkflow value);

	/**
	 * Returns the value of the '<em><b>Parameterdomain</b></em>' containment reference list.
	 * The list contents are of type {@link com.extremexp.emf.model.workflow.ParameterDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameterdomain</em>' containment reference list.
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getDeployedWorkflowParameterSpace_Parameterdomain()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterDomain> getParameterdomain();

} // DeployedWorkflowParameterSpace
