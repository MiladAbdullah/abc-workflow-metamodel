/**
 */
package com.extremexp.emf.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.extremexp.emf.model.workflow.Condition#getName <em>Name</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.Condition#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getCondition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.extremexp.emf.model.workflow.Condition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link com.extremexp.emf.model.workflow.Case}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getCondition_Cases()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Case> getCases();

} // Condition
