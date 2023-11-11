/**
 */
package com.extremexp.emf.model.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.extremexp.emf.model.workflow.EventNode#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getEventNode()
 * @model
 * @generated
 */
public interface EventNode extends Node {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * The literals are from the enumeration {@link com.extremexp.emf.model.workflow.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see com.extremexp.emf.model.workflow.Event
	 * @see #setEvent(Event)
	 * @see com.extremexp.emf.model.workflow.WorkflowPackage#getEventNode_Event()
	 * @model
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link com.extremexp.emf.model.workflow.EventNode#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see com.extremexp.emf.model.workflow.Event
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // EventNode
