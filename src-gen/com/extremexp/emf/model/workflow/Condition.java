/**
 */
package com.extremexp.emf.model.workflow;

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
 *   <li>{@link com.extremexp.emf.model.workflow.Condition#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.Condition#getTrue <em>True</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.Condition#getFalse <em>False</em>}</li>
 * </ul>
 *
 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getCondition_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link com.extremexp.emf.model.workflow.Condition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>True</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True</em>' reference.
	 * @see #setTrue(Node)
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getCondition_True()
	 * @model required="true"
	 * @generated
	 */
	Node getTrue();

	/**
	 * Sets the value of the '{@link com.extremexp.emf.model.workflow.Condition#getTrue <em>True</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True</em>' reference.
	 * @see #getTrue()
	 * @generated
	 */
	void setTrue(Node value);

	/**
	 * Returns the value of the '<em><b>False</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False</em>' reference.
	 * @see #setFalse(Node)
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getCondition_False()
	 * @model required="true"
	 * @generated
	 */
	Node getFalse();

	/**
	 * Sets the value of the '{@link com.extremexp.emf.model.workflow.Condition#getFalse <em>False</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>False</em>' reference.
	 * @see #getFalse()
	 * @generated
	 */
	void setFalse(Node value);

} // Condition
