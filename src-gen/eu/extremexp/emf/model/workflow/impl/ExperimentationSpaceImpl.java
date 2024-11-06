/**
 */
package eu.extremexp.emf.model.workflow.impl;

import eu.extremexp.emf.model.workflow.AssembledWorflow;
import eu.extremexp.emf.model.workflow.ExperimentationSpace;
import eu.extremexp.emf.model.workflow.ParameterValue;
import eu.extremexp.emf.model.workflow.TaskConfiguration;
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
 * An implementation of the model object '<em><b>Experimentation Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.impl.ExperimentationSpaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.impl.ExperimentationSpaceImpl#getWorflow <em>Worflow</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.impl.ExperimentationSpaceImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.impl.ExperimentationSpaceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.impl.ExperimentationSpaceImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentationSpaceImpl extends MinimalEObjectImpl.Container implements ExperimentationSpace {
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
	 * The cached value of the '{@link #getWorflow() <em>Worflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorflow()
	 * @generated
	 * @ordered
	 */
	protected AssembledWorflow worflow;

	/**
	 * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected String strategy = STRATEGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValue> parameters;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskConfiguration> configurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentationSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.EXPERIMENTATION_SPACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.EXPERIMENTATION_SPACE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssembledWorflow getWorflow() {
		if (worflow != null && worflow.eIsProxy()) {
			InternalEObject oldWorflow = (InternalEObject) worflow;
			worflow = (AssembledWorflow) eResolveProxy(oldWorflow);
			if (worflow != oldWorflow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WorkflowPackage.EXPERIMENTATION_SPACE__WORFLOW, oldWorflow, worflow));
			}
		}
		return worflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssembledWorflow basicGetWorflow() {
		return worflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorflow(AssembledWorflow newWorflow) {
		AssembledWorflow oldWorflow = worflow;
		worflow = newWorflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.EXPERIMENTATION_SPACE__WORFLOW,
					oldWorflow, worflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(String newStrategy) {
		String oldStrategy = strategy;
		strategy = newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.EXPERIMENTATION_SPACE__STRATEGY,
					oldStrategy, strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterValue> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ParameterValue>(ParameterValue.class, this,
					WorkflowPackage.EXPERIMENTATION_SPACE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskConfiguration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList<TaskConfiguration>(TaskConfiguration.class, this,
					WorkflowPackage.EXPERIMENTATION_SPACE__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.EXPERIMENTATION_SPACE__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.EXPERIMENTATION_SPACE__CONFIGURATIONS:
			return ((InternalEList<?>) getConfigurations()).basicRemove(otherEnd, msgs);
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
		case WorkflowPackage.EXPERIMENTATION_SPACE__NAME:
			return getName();
		case WorkflowPackage.EXPERIMENTATION_SPACE__WORFLOW:
			if (resolve)
				return getWorflow();
			return basicGetWorflow();
		case WorkflowPackage.EXPERIMENTATION_SPACE__STRATEGY:
			return getStrategy();
		case WorkflowPackage.EXPERIMENTATION_SPACE__PARAMETERS:
			return getParameters();
		case WorkflowPackage.EXPERIMENTATION_SPACE__CONFIGURATIONS:
			return getConfigurations();
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
		case WorkflowPackage.EXPERIMENTATION_SPACE__NAME:
			setName((String) newValue);
			return;
		case WorkflowPackage.EXPERIMENTATION_SPACE__WORFLOW:
			setWorflow((AssembledWorflow) newValue);
			return;
		case WorkflowPackage.EXPERIMENTATION_SPACE__STRATEGY:
			setStrategy((String) newValue);
			return;
		case WorkflowPackage.EXPERIMENTATION_SPACE__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends ParameterValue>) newValue);
			return;
		case WorkflowPackage.EXPERIMENTATION_SPACE__CONFIGURATIONS:
			getConfigurations().clear();
			getConfigurations().addAll((Collection<? extends TaskConfiguration>) newValue);
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
		case WorkflowPackage.EXPERIMENTATION_SPACE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WorkflowPackage.EXPERIMENTATION_SPACE__WORFLOW:
			setWorflow((AssembledWorflow) null);
			return;
		case WorkflowPackage.EXPERIMENTATION_SPACE__STRATEGY:
			setStrategy(STRATEGY_EDEFAULT);
			return;
		case WorkflowPackage.EXPERIMENTATION_SPACE__PARAMETERS:
			getParameters().clear();
			return;
		case WorkflowPackage.EXPERIMENTATION_SPACE__CONFIGURATIONS:
			getConfigurations().clear();
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
		case WorkflowPackage.EXPERIMENTATION_SPACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case WorkflowPackage.EXPERIMENTATION_SPACE__WORFLOW:
			return worflow != null;
		case WorkflowPackage.EXPERIMENTATION_SPACE__STRATEGY:
			return STRATEGY_EDEFAULT == null ? strategy != null : !STRATEGY_EDEFAULT.equals(strategy);
		case WorkflowPackage.EXPERIMENTATION_SPACE__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case WorkflowPackage.EXPERIMENTATION_SPACE__CONFIGURATIONS:
			return configurations != null && !configurations.isEmpty();
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
		result.append(", strategy: ");
		result.append(strategy);
		result.append(')');
		return result.toString();
	}

} //ExperimentationSpaceImpl
