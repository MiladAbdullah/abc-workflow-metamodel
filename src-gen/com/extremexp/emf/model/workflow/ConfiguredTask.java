/**
 */
package com.extremexp.emf.model.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configured Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.extremexp.emf.model.workflow.ConfiguredTask#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getConfiguredTask()
 * @model
 * @generated
 */
public interface ConfiguredTask extends Task {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Task)
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getConfiguredTask_Configuration()
	 * @model
	 * @generated
	 */
	Task getConfiguration();

	/**
	 * Sets the value of the '{@link com.extremexp.emf.model.workflow.ConfiguredTask#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Task value);

} // ConfiguredTask
