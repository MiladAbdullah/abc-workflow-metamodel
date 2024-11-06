/**
 */
package eu.extremexp.emf.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.ControlElement#getSpace <em>Space</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.ControlElement#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getControlElement()
 * @model
 * @generated
 */
public interface ControlElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' reference.
	 * @see #setSpace(ExperimentationSpace)
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getControlElement_Space()
	 * @model required="true"
	 * @generated
	 */
	ExperimentationSpace getSpace();

	/**
	 * Sets the value of the '{@link eu.extremexp.emf.model.workflow.ControlElement#getSpace <em>Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' reference.
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(ExperimentationSpace value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.emf.model.workflow.ControlElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference list.
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getControlElement_Next()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlElement> getNext();

} // ControlElement
