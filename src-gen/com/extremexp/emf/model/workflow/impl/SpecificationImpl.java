/**
 */
package com.extremexp.emf.model.workflow.impl;

import com.extremexp.emf.model.workflow.DeployedWorkflow;
import com.extremexp.emf.model.workflow.ExperimentSpace;
import com.extremexp.emf.model.workflow.Group;
import com.extremexp.emf.model.workflow.ParameterType;
import com.extremexp.emf.model.workflow.Specification;
import com.extremexp.emf.model.workflow.Workflow;
import com.extremexp.emf.model.workflow.WorkflowPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.extremexp.emf.model.workflow.impl.SpecificationImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.impl.SpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.impl.SpecificationImpl#getParametertypes <em>Parametertypes</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.impl.SpecificationImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.impl.SpecificationImpl#getDeployedworkflow <em>Deployedworkflow</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.impl.SpecificationImpl#getExperimentspace <em>Experimentspace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationImpl extends MinimalEObjectImpl.Container implements Specification {
	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParametertypes() <em>Parametertypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterType> parametertypes;

	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected EList<Workflow> workflow;

	/**
	 * The cached value of the '{@link #getDeployedworkflow() <em>Deployedworkflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedworkflow()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedWorkflow> deployedworkflow;

	/**
	 * The cached value of the '{@link #getExperimentspace() <em>Experimentspace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimentspace()
	 * @generated
	 * @ordered
	 */
	protected EList<ExperimentSpace> experimentspace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, WorkflowPackage.SPECIFICATION__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterType> getParametertypes() {
		if (parametertypes == null) {
			parametertypes = new EObjectContainmentEList<ParameterType>(ParameterType.class, this,
					WorkflowPackage.SPECIFICATION__PARAMETERTYPES);
		}
		return parametertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workflow> getWorkflow() {
		if (workflow == null) {
			workflow = new EObjectContainmentEList<Workflow>(Workflow.class, this,
					WorkflowPackage.SPECIFICATION__WORKFLOW);
		}
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployedWorkflow> getDeployedworkflow() {
		if (deployedworkflow == null) {
			deployedworkflow = new EObjectContainmentEList<DeployedWorkflow>(DeployedWorkflow.class, this,
					WorkflowPackage.SPECIFICATION__DEPLOYEDWORKFLOW);
		}
		return deployedworkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExperimentSpace> getExperimentspace() {
		if (experimentspace == null) {
			experimentspace = new EObjectContainmentEList<ExperimentSpace>(ExperimentSpace.class, this,
					WorkflowPackage.SPECIFICATION__EXPERIMENTSPACE);
		}
		return experimentspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.SPECIFICATION__GROUPS:
			return ((InternalEList<?>) getGroups()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.SPECIFICATION__PARAMETERTYPES:
			return ((InternalEList<?>) getParametertypes()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.SPECIFICATION__WORKFLOW:
			return ((InternalEList<?>) getWorkflow()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.SPECIFICATION__DEPLOYEDWORKFLOW:
			return ((InternalEList<?>) getDeployedworkflow()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.SPECIFICATION__EXPERIMENTSPACE:
			return ((InternalEList<?>) getExperimentspace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.SPECIFICATION__GROUPS:
			return getGroups();
		case WorkflowPackage.SPECIFICATION__NAME:
			return getName();
		case WorkflowPackage.SPECIFICATION__PARAMETERTYPES:
			return getParametertypes();
		case WorkflowPackage.SPECIFICATION__WORKFLOW:
			return getWorkflow();
		case WorkflowPackage.SPECIFICATION__DEPLOYEDWORKFLOW:
			return getDeployedworkflow();
		case WorkflowPackage.SPECIFICATION__EXPERIMENTSPACE:
			return getExperimentspace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WorkflowPackage.SPECIFICATION__GROUPS:
			getGroups().clear();
			getGroups().addAll((Collection<? extends Group>) newValue);
			return;
		case WorkflowPackage.SPECIFICATION__NAME:
			setName((String) newValue);
			return;
		case WorkflowPackage.SPECIFICATION__PARAMETERTYPES:
			getParametertypes().clear();
			getParametertypes().addAll((Collection<? extends ParameterType>) newValue);
			return;
		case WorkflowPackage.SPECIFICATION__WORKFLOW:
			getWorkflow().clear();
			getWorkflow().addAll((Collection<? extends Workflow>) newValue);
			return;
		case WorkflowPackage.SPECIFICATION__DEPLOYEDWORKFLOW:
			getDeployedworkflow().clear();
			getDeployedworkflow().addAll((Collection<? extends DeployedWorkflow>) newValue);
			return;
		case WorkflowPackage.SPECIFICATION__EXPERIMENTSPACE:
			getExperimentspace().clear();
			getExperimentspace().addAll((Collection<? extends ExperimentSpace>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case WorkflowPackage.SPECIFICATION__GROUPS:
			getGroups().clear();
			return;
		case WorkflowPackage.SPECIFICATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WorkflowPackage.SPECIFICATION__PARAMETERTYPES:
			getParametertypes().clear();
			return;
		case WorkflowPackage.SPECIFICATION__WORKFLOW:
			getWorkflow().clear();
			return;
		case WorkflowPackage.SPECIFICATION__DEPLOYEDWORKFLOW:
			getDeployedworkflow().clear();
			return;
		case WorkflowPackage.SPECIFICATION__EXPERIMENTSPACE:
			getExperimentspace().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WorkflowPackage.SPECIFICATION__GROUPS:
			return groups != null && !groups.isEmpty();
		case WorkflowPackage.SPECIFICATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case WorkflowPackage.SPECIFICATION__PARAMETERTYPES:
			return parametertypes != null && !parametertypes.isEmpty();
		case WorkflowPackage.SPECIFICATION__WORKFLOW:
			return workflow != null && !workflow.isEmpty();
		case WorkflowPackage.SPECIFICATION__DEPLOYEDWORKFLOW:
			return deployedworkflow != null && !deployedworkflow.isEmpty();
		case WorkflowPackage.SPECIFICATION__EXPERIMENTSPACE:
			return experimentspace != null && !experimentspace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecificationImpl
