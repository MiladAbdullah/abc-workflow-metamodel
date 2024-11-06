/**
 */
package eu.extremexp.emf.model.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembled Worflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.AssembledWorflow#getSubstitutedTask <em>Substituted Task</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.AssembledWorflow#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getAssembledWorflow()
 * @model
 * @generated
 */
public interface AssembledWorflow extends Workflow {
	/**
	 * Returns the value of the '<em><b>Substituted Task</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.emf.model.workflow.SubstitutedTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substituted Task</em>' containment reference list.
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getAssembledWorflow_SubstitutedTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstitutedTask> getSubstitutedTask();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Workflow)
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getAssembledWorflow_Parent()
	 * @model required="true"
	 * @generated
	 */
	Workflow getParent();

	/**
	 * Sets the value of the '{@link eu.extremexp.emf.model.workflow.AssembledWorflow#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Workflow value);

} // AssembledWorflow
