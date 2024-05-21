/**
 */
package com.extremexp.emf.model.workflow.impl;

import com.extremexp.emf.model.workflow.ConditionalLink;
import com.extremexp.emf.model.workflow.WorkflowPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConditionalLinkImpl extends LinkImpl implements ConditionalLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.CONDITIONAL_LINK;
	}

} //ConditionalLinkImpl
