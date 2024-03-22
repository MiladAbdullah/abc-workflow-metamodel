/**
 */
package com.extremexp.emf.model.workflow.impl;

import com.extremexp.emf.model.workflow.Condition;
import com.extremexp.emf.model.workflow.Node;
import com.extremexp.emf.model.workflow.WorkflowPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.extremexp.emf.model.workflow.impl.ConditionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.impl.ConditionImpl#getTrue <em>True</em>}</li>
 *   <li>{@link com.extremexp.emf.model.workflow.impl.ConditionImpl#getFalse <em>False</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrue() <em>True</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrue()
	 * @generated
	 * @ordered
	 */
	protected Node true_;

	/**
	 * The cached value of the '{@link #getFalse() <em>False</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalse()
	 * @generated
	 * @ordered
	 */
	protected Node false_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CONDITION__CONDITION, oldCondition,
					condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getTrue() {
		if (true_ != null && true_.eIsProxy()) {
			InternalEObject oldTrue = (InternalEObject) true_;
			true_ = (Node) eResolveProxy(oldTrue);
			if (true_ != oldTrue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.CONDITION__TRUE, oldTrue,
							true_));
			}
		}
		return true_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTrue() {
		return true_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrue(Node newTrue) {
		Node oldTrue = true_;
		true_ = newTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CONDITION__TRUE, oldTrue, true_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFalse() {
		if (false_ != null && false_.eIsProxy()) {
			InternalEObject oldFalse = (InternalEObject) false_;
			false_ = (Node) eResolveProxy(oldFalse);
			if (false_ != oldFalse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.CONDITION__FALSE,
							oldFalse, false_));
			}
		}
		return false_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetFalse() {
		return false_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFalse(Node newFalse) {
		Node oldFalse = false_;
		false_ = newFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CONDITION__FALSE, oldFalse, false_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.CONDITION__CONDITION:
			return getCondition();
		case WorkflowPackage.CONDITION__TRUE:
			if (resolve)
				return getTrue();
			return basicGetTrue();
		case WorkflowPackage.CONDITION__FALSE:
			if (resolve)
				return getFalse();
			return basicGetFalse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WorkflowPackage.CONDITION__CONDITION:
			setCondition((String) newValue);
			return;
		case WorkflowPackage.CONDITION__TRUE:
			setTrue((Node) newValue);
			return;
		case WorkflowPackage.CONDITION__FALSE:
			setFalse((Node) newValue);
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
		case WorkflowPackage.CONDITION__CONDITION:
			setCondition(CONDITION_EDEFAULT);
			return;
		case WorkflowPackage.CONDITION__TRUE:
			setTrue((Node) null);
			return;
		case WorkflowPackage.CONDITION__FALSE:
			setFalse((Node) null);
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
		case WorkflowPackage.CONDITION__CONDITION:
			return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
		case WorkflowPackage.CONDITION__TRUE:
			return true_ != null;
		case WorkflowPackage.CONDITION__FALSE:
			return false_ != null;
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
