/**
 */
package com.extremexp.emf.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.extremexp.emf.model.workflow.Specification#getGroups <em>Groups</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.Specification#getName <em>Name</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.Specification#getParametertypes <em>Parametertypes</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.Specification#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.Specification#getDeployedworkflow <em>Deployedworkflow</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.Specification#getExperimentspace <em>Experimentspace</em>}</li>
 * </ul>
 *
 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link com.extremexp.emf.model.workflow.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getSpecification_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getSpecification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.extremexp.emf.model.workflow.Specification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parametertypes</b></em>' containment reference list.
	 * The list contents are of type {@link com.extremexp.emf.model.workflow.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametertypes</em>' containment reference list.
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getSpecification_Parametertypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterType> getParametertypes();

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' containment reference list.
	 * The list contents are of type {@link com.extremexp.emf.model.workflow.Workflow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' containment reference list.
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getSpecification_Workflow()
	 * @model containment="true"
	 * @generated
	 */
	EList<Workflow> getWorkflow();

	/**
	 * Returns the value of the '<em><b>Deployedworkflow</b></em>' containment reference list.
	 * The list contents are of type {@link com.extremexp.emf.model.workflow.DeployedWorkflow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployedworkflow</em>' containment reference list.
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getSpecification_Deployedworkflow()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeployedWorkflow> getDeployedworkflow();

	/**
	 * Returns the value of the '<em><b>Experimentspace</b></em>' containment reference list.
	 * The list contents are of type {@link com.extremexp.emf.model.workflow.ExperimentSpace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experimentspace</em>' containment reference list.
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getSpecification_Experimentspace()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExperimentSpace> getExperimentspace();

} // Specification
