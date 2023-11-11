/**
 */
package com.extremexp.emf.model.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.extremexp.emf.model.workflow.PrimitiveParameter#getPrimitive <em>Primitive</em>}</li>
 * </ul>
 *
 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getPrimitiveParameter()
 * @model
 * @generated
 */
public interface PrimitiveParameter extends ParameterType {
	/**
	 * Returns the value of the '<em><b>Primitive</b></em>' attribute.
	 * The literals are from the enumeration {@link com.extremexp.emf.model.workflow.Primitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive</em>' attribute.
	 * @see com.extremexp.emf.model.workflow.Primitive
	 * @see #setPrimitive(Primitive)
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getPrimitiveParameter_Primitive()
	 * @model
	 * @generated
	 */
	Primitive getPrimitive();

	/**
	 * Sets the value of the '{@link com.extremexp.emf.model.workflow.PrimitiveParameter#getPrimitive <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive</em>' attribute.
	 * @see com.extremexp.emf.model.workflow.Primitive
	 * @see #getPrimitive()
	 * @generated
	 */
	void setPrimitive(Primitive value);

} // PrimitiveParameter
