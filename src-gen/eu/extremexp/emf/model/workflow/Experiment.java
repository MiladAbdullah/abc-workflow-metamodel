/**
 */
package eu.extremexp.emf.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.Experiment#getIntent <em>Intent</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.Experiment#getControl <em>Control</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.Experiment#getSpaces <em>Spaces</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.Experiment#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getExperiment()
 * @model
 * @generated
 */
public interface Experiment extends EObject {
	/**
	 * Returns the value of the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' containment reference.
	 * @see #setIntent(IntentRef)
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getExperiment_Intent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntentRef getIntent();

	/**
	 * Sets the value of the '{@link eu.extremexp.emf.model.workflow.Experiment#getIntent <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' containment reference.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(IntentRef value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference.
	 * @see #setControl(Control)
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getExperiment_Control()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Control getControl();

	/**
	 * Sets the value of the '{@link eu.extremexp.emf.model.workflow.Experiment#getControl <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(Control value);

	/**
	 * Returns the value of the '<em><b>Spaces</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.emf.model.workflow.ExperimentationSpace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spaces</em>' containment reference list.
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getExperiment_Spaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExperimentationSpace> getSpaces();

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' reference.
	 * @see #setWorkflow(Workflow)
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getExperiment_Workflow()
	 * @model required="true"
	 * @generated
	 */
	Workflow getWorkflow();

	/**
	 * Sets the value of the '{@link eu.extremexp.emf.model.workflow.Experiment#getWorkflow <em>Workflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	void setWorkflow(Workflow value);

} // Experiment
