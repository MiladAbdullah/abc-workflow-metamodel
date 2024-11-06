/**
 */
package eu.extremexp.emf.model.workflow.impl;

import eu.extremexp.emf.model.workflow.Group;
import eu.extremexp.emf.model.workflow.ParameterType;
import eu.extremexp.emf.model.workflow.ROOT;
import eu.extremexp.emf.model.workflow.Workflow;
import eu.extremexp.emf.model.workflow.WorkflowPackage;

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
 * An implementation of the model object '<em><b>ROOT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.impl.ROOTImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.impl.ROOTImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.impl.ROOTImpl#getParametertypes <em>Parametertypes</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.impl.ROOTImpl#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ROOTImpl extends MinimalEObjectImpl.Container implements ROOT {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROOTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, WorkflowPackage.ROOT__GROUPS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ROOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterType> getParametertypes() {
		if (parametertypes == null) {
			parametertypes = new EObjectContainmentEList<ParameterType>(ParameterType.class, this,
					WorkflowPackage.ROOT__PARAMETERTYPES);
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
			workflow = new EObjectContainmentEList<Workflow>(Workflow.class, this, WorkflowPackage.ROOT__WORKFLOW);
		}
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.ROOT__GROUPS:
			return ((InternalEList<?>) getGroups()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.ROOT__PARAMETERTYPES:
			return ((InternalEList<?>) getParametertypes()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.ROOT__WORKFLOW:
			return ((InternalEList<?>) getWorkflow()).basicRemove(otherEnd, msgs);
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
		case WorkflowPackage.ROOT__GROUPS:
			return getGroups();
		case WorkflowPackage.ROOT__NAME:
			return getName();
		case WorkflowPackage.ROOT__PARAMETERTYPES:
			return getParametertypes();
		case WorkflowPackage.ROOT__WORKFLOW:
			return getWorkflow();
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
		case WorkflowPackage.ROOT__GROUPS:
			getGroups().clear();
			getGroups().addAll((Collection<? extends Group>) newValue);
			return;
		case WorkflowPackage.ROOT__NAME:
			setName((String) newValue);
			return;
		case WorkflowPackage.ROOT__PARAMETERTYPES:
			getParametertypes().clear();
			getParametertypes().addAll((Collection<? extends ParameterType>) newValue);
			return;
		case WorkflowPackage.ROOT__WORKFLOW:
			getWorkflow().clear();
			getWorkflow().addAll((Collection<? extends Workflow>) newValue);
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
		case WorkflowPackage.ROOT__GROUPS:
			getGroups().clear();
			return;
		case WorkflowPackage.ROOT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WorkflowPackage.ROOT__PARAMETERTYPES:
			getParametertypes().clear();
			return;
		case WorkflowPackage.ROOT__WORKFLOW:
			getWorkflow().clear();
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
		case WorkflowPackage.ROOT__GROUPS:
			return groups != null && !groups.isEmpty();
		case WorkflowPackage.ROOT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case WorkflowPackage.ROOT__PARAMETERTYPES:
			return parametertypes != null && !parametertypes.isEmpty();
		case WorkflowPackage.ROOT__WORKFLOW:
			return workflow != null && !workflow.isEmpty();
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

} //ROOTImpl
