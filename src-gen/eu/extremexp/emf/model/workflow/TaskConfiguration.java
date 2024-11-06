/**
 */
package eu.extremexp.emf.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.TaskConfiguration#getParameters <em>Parameters</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.TaskConfiguration#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getTaskConfiguration()
 * @model
 * @generated
 */
public interface TaskConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.emf.model.workflow.ParameterValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getTaskConfiguration_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterValue> getParameters();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getTaskConfiguration_Task()
	 * @model required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link eu.extremexp.emf.model.workflow.TaskConfiguration#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

} // TaskConfiguration
