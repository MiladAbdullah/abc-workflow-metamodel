/**
 */
package eu.extremexp.emf.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.Control#getKind <em>Kind</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.Control#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.extremexp.emf.model.workflow.ControlKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see eu.extremexp.emf.model.workflow.ControlKind
	 * @see #setKind(ControlKind)
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getControl_Kind()
	 * @model
	 * @generated
	 */
	ControlKind getKind();

	/**
	 * Sets the value of the '{@link eu.extremexp.emf.model.workflow.Control#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see eu.extremexp.emf.model.workflow.ControlKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ControlKind value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.emf.model.workflow.ControlElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference list.
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getControl_Control()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlElement> getControl();

} // Control
