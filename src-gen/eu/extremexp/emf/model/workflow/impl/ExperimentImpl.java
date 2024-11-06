/**
 */
package eu.extremexp.emf.model.workflow.impl;

import eu.extremexp.emf.model.workflow.Control;
import eu.extremexp.emf.model.workflow.Experiment;
import eu.extremexp.emf.model.workflow.ExperimentationSpace;
import eu.extremexp.emf.model.workflow.IntentRef;
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
 * An implementation of the model object '<em><b>Experiment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.impl.ExperimentImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.impl.ExperimentImpl#getControl <em>Control</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.impl.ExperimentImpl#getSpaces <em>Spaces</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.impl.ExperimentImpl#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentImpl extends MinimalEObjectImpl.Container implements Experiment {
	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected IntentRef intent;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected Control control;

	/**
	 * The cached value of the '{@link #getSpaces() <em>Spaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ExperimentationSpace> spaces;

	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected Workflow workflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.EXPERIMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentRef getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(IntentRef newIntent, NotificationChain msgs) {
		IntentRef oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkflowPackage.EXPERIMENT__INTENT, oldIntent, newIntent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(IntentRef newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject) intent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.EXPERIMENT__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject) newIntent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.EXPERIMENT__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.EXPERIMENT__INTENT, newIntent,
					newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control getControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControl(Control newControl, NotificationChain msgs) {
		Control oldControl = control;
		control = newControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkflowPackage.EXPERIMENT__CONTROL, oldControl, newControl);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl(Control newControl) {
		if (newControl != control) {
			NotificationChain msgs = null;
			if (control != null)
				msgs = ((InternalEObject) control).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.EXPERIMENT__CONTROL, null, msgs);
			if (newControl != null)
				msgs = ((InternalEObject) newControl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.EXPERIMENT__CONTROL, null, msgs);
			msgs = basicSetControl(newControl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.EXPERIMENT__CONTROL, newControl,
					newControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExperimentationSpace> getSpaces() {
		if (spaces == null) {
			spaces = new EObjectContainmentEList<ExperimentationSpace>(ExperimentationSpace.class, this,
					WorkflowPackage.EXPERIMENT__SPACES);
		}
		return spaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow getWorkflow() {
		if (workflow != null && workflow.eIsProxy()) {
			InternalEObject oldWorkflow = (InternalEObject) workflow;
			workflow = (Workflow) eResolveProxy(oldWorkflow);
			if (workflow != oldWorkflow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.EXPERIMENT__WORKFLOW,
							oldWorkflow, workflow));
			}
		}
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow basicGetWorkflow() {
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflow(Workflow newWorkflow) {
		Workflow oldWorkflow = workflow;
		workflow = newWorkflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.EXPERIMENT__WORKFLOW, oldWorkflow,
					workflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.EXPERIMENT__INTENT:
			return basicSetIntent(null, msgs);
		case WorkflowPackage.EXPERIMENT__CONTROL:
			return basicSetControl(null, msgs);
		case WorkflowPackage.EXPERIMENT__SPACES:
			return ((InternalEList<?>) getSpaces()).basicRemove(otherEnd, msgs);
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
		case WorkflowPackage.EXPERIMENT__INTENT:
			return getIntent();
		case WorkflowPackage.EXPERIMENT__CONTROL:
			return getControl();
		case WorkflowPackage.EXPERIMENT__SPACES:
			return getSpaces();
		case WorkflowPackage.EXPERIMENT__WORKFLOW:
			if (resolve)
				return getWorkflow();
			return basicGetWorkflow();
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
		case WorkflowPackage.EXPERIMENT__INTENT:
			setIntent((IntentRef) newValue);
			return;
		case WorkflowPackage.EXPERIMENT__CONTROL:
			setControl((Control) newValue);
			return;
		case WorkflowPackage.EXPERIMENT__SPACES:
			getSpaces().clear();
			getSpaces().addAll((Collection<? extends ExperimentationSpace>) newValue);
			return;
		case WorkflowPackage.EXPERIMENT__WORKFLOW:
			setWorkflow((Workflow) newValue);
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
		case WorkflowPackage.EXPERIMENT__INTENT:
			setIntent((IntentRef) null);
			return;
		case WorkflowPackage.EXPERIMENT__CONTROL:
			setControl((Control) null);
			return;
		case WorkflowPackage.EXPERIMENT__SPACES:
			getSpaces().clear();
			return;
		case WorkflowPackage.EXPERIMENT__WORKFLOW:
			setWorkflow((Workflow) null);
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
		case WorkflowPackage.EXPERIMENT__INTENT:
			return intent != null;
		case WorkflowPackage.EXPERIMENT__CONTROL:
			return control != null;
		case WorkflowPackage.EXPERIMENT__SPACES:
			return spaces != null && !spaces.isEmpty();
		case WorkflowPackage.EXPERIMENT__WORKFLOW:
			return workflow != null;
		}
		return super.eIsSet(featureID);
	}

} //ExperimentImpl
