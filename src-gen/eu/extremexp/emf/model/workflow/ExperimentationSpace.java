/**
 */
package eu.extremexp.emf.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experimentation Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.ExperimentationSpace#getName <em>Name</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.ExperimentationSpace#getWorflow <em>Worflow</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.ExperimentationSpace#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.ExperimentationSpace#getParameters <em>Parameters</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.ExperimentationSpace#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getExperimentationSpace()
 * @model
 * @generated
 */
public interface ExperimentationSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getExperimentationSpace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.extremexp.emf.model.workflow.ExperimentationSpace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Worflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worflow</em>' reference.
	 * @see #setWorflow(AssembledWorflow)
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getExperimentationSpace_Worflow()
	 * @model
	 * @generated
	 */
	AssembledWorflow getWorflow();

	/**
	 * Sets the value of the '{@link eu.extremexp.emf.model.workflow.ExperimentationSpace#getWorflow <em>Worflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worflow</em>' reference.
	 * @see #getWorflow()
	 * @generated
	 */
	void setWorflow(AssembledWorflow value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see #setStrategy(String)
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getExperimentationSpace_Strategy()
	 * @model
	 * @generated
	 */
	String getStrategy();

	/**
	 * Sets the value of the '{@link eu.extremexp.emf.model.workflow.ExperimentationSpace#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.emf.model.workflow.ParameterValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getExperimentationSpace_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterValue> getParameters();

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link eu.extremexp.emf.model.workflow.TaskConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getExperimentationSpace_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskConfiguration> getConfigurations();

} // ExperimentationSpace
