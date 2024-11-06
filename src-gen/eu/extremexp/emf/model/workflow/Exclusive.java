/**
 */
package eu.extremexp.emf.model.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.Exclusive#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getExclusive()
 * @model
 * @generated
 */
public interface Exclusive extends Operator {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.emf.model.workflow.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getExclusive_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getCondition();

} // Exclusive
