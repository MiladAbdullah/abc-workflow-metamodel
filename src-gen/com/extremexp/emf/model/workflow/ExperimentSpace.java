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
 *   <li>{@link com.extremexp.emf.model.workflow.ExperimentSpace#getDeployedworkflowparameterspace <em>Deployedworkflowparameterspace</em>}</li>
 * </ul>
 *
 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getExperimentSpace()
 * @model
 * @generated
 */
public interface ExperimentSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployedworkflowparameterspace</b></em>' containment reference list.
	 * The list contents are of type {@link com.extremexp.emf.model.workflow.DeployedWorkflowParameterSpace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployedworkflowparameterspace</em>' containment reference list.
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getExperimentSpace_Deployedworkflowparameterspace()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeployedWorkflowParameterSpace> getDeployedworkflowparameterspace();

} // ExperimentSpace
