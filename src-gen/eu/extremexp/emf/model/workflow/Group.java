/**
 */
package eu.extremexp.emf.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.Group#getName <em>Name</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.Group#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.Group#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.extremexp.emf.model.workflow.Group#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.emf.model.workflow.MetaData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getGroup_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaData> getMetadata();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link eu.extremexp.emf.model.workflow.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getGroup_Tasks()
	 * @model
	 * @generated
	 */
	EList<Task> getTasks();

} // Group
