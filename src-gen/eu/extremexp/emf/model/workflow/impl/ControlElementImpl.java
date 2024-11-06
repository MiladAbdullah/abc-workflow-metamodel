/**
 */
package eu.extremexp.emf.model.workflow.impl;

import eu.extremexp.emf.model.workflow.ControlElement;
import eu.extremexp.emf.model.workflow.ExperimentationSpace;
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
 * An implementation of the model object '<em><b>Control Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.extremexp.emf.model.workflow.impl.ControlElementImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link eu.extremexp.emf.model.workflow.impl.ControlElementImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlElementImpl extends MinimalEObjectImpl.Container implements ControlElement {
	/**
	 * The cached value of the '{@link #getSpace() <em>Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected ExperimentationSpace space;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlElement> next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.CONTROL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentationSpace getSpace() {
		if (space != null && space.eIsProxy()) {
			InternalEObject oldSpace = (InternalEObject) space;
			space = (ExperimentationSpace) eResolveProxy(oldSpace);
			if (space != oldSpace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.CONTROL_ELEMENT__SPACE,
							oldSpace, space));
			}
		}
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentationSpace basicGetSpace() {
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpace(ExperimentationSpace newSpace) {
		ExperimentationSpace oldSpace = space;
		space = newSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CONTROL_ELEMENT__SPACE, oldSpace,
					space));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlElement> getNext() {
		if (next == null) {
			next = new EObjectContainmentEList<ControlElement>(ControlElement.class, this,
					WorkflowPackage.CONTROL_ELEMENT__NEXT);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.CONTROL_ELEMENT__NEXT:
			return ((InternalEList<?>) getNext()).basicRemove(otherEnd, msgs);
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
		case WorkflowPackage.CONTROL_ELEMENT__SPACE:
			if (resolve)
				return getSpace();
			return basicGetSpace();
		case WorkflowPackage.CONTROL_ELEMENT__NEXT:
			return getNext();
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
		case WorkflowPackage.CONTROL_ELEMENT__SPACE:
			setSpace((ExperimentationSpace) newValue);
			return;
		case WorkflowPackage.CONTROL_ELEMENT__NEXT:
			getNext().clear();
			getNext().addAll((Collection<? extends ControlElement>) newValue);
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
		case WorkflowPackage.CONTROL_ELEMENT__SPACE:
			setSpace((ExperimentationSpace) null);
			return;
		case WorkflowPackage.CONTROL_ELEMENT__NEXT:
			getNext().clear();
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
		case WorkflowPackage.CONTROL_ELEMENT__SPACE:
			return space != null;
		case WorkflowPackage.CONTROL_ELEMENT__NEXT:
			return next != null && !next.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlElementImpl
