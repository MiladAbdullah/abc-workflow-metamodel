/**
 */
package eu.extremexp.emf.model.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.Array#getLength <em>Length</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.Array#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends ParameterType {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getArray_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link eu.extremexp.emf.model.workflow.Array#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ParameterType)
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getArray_Type()
	 * @model
	 * @generated
	 */
	ParameterType getType();

	/**
	 * Sets the value of the '{@link eu.extremexp.emf.model.workflow.Array#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterType value);

} // Array
