/**
 */
package eu.extremexp.emf.model.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.CompositeWorkflow#getNode <em>Node</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.CompositeWorkflow#getLinks <em>Links</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.CompositeWorkflow#getDataLinks <em>Data Links</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getCompositeWorkflow()
 * @model
 * @generated
 */
public interface CompositeWorkflow extends Workflow {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.emf.model.workflow.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getCompositeWorkflow_Node()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.emf.model.workflow.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getCompositeWorkflow_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Data Links</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.emf.model.workflow.DataLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Links</em>' containment reference list.
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getCompositeWorkflow_DataLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataLink> getDataLinks();

} // CompositeWorkflow
