/**
 */
package com.extremexp.emf.model.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Input Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.extremexp.emf.model.workflow.ExternalInputData#getEligibilityCondition <em>Eligibility Condition</em>}</li>
 * </ul>
 *
 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getExternalInputData()
 * @model
 * @generated
 */
public interface ExternalInputData extends InputData {
	/**
	 * Returns the value of the '<em><b>Eligibility Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eligibility Condition</em>' attribute.
	 * @see #setEligibilityCondition(String)
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getExternalInputData_EligibilityCondition()
	 * @model
	 * @generated
	 */
	String getEligibilityCondition();

	/**
	 * Sets the value of the '{@link com.extremexp.emf.model.workflow.ExternalInputData#getEligibilityCondition <em>Eligibility Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eligibility Condition</em>' attribute.
	 * @see #getEligibilityCondition()
	 * @generated
	 */
	void setEligibilityCondition(String value);

} // ExternalInputData
