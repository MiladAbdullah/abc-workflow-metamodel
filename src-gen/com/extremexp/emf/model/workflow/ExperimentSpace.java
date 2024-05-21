/**
 */
package com.extremexp.emf.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.extremexp.emf.model.workflow.ExperimentSpace#getDeployedworkflow <em>Deployedworkflow</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.ExperimentSpace#getParameterdomain <em>Parameterdomain</em>}</li>
 * </ul>
 *
 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getExperimentSpace()
 * @model
 * @generated
 */
public interface ExperimentSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployedworkflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployedworkflow</em>' reference.
	 * @see #setDeployedworkflow(DeployedWorkflow)
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getExperimentSpace_Deployedworkflow()
	 * @model
	 * @generated
	 */
	DeployedWorkflow getDeployedworkflow();

	/**
	 * Sets the value of the '{@link com.extremexp.emf.model.workflow.ExperimentSpace#getDeployedworkflow <em>Deployedworkflow</em>}' reference.
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
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getExperimentSpace_Parameterdomain()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterDomain> getParameterdomain();

} // ExperimentSpace
