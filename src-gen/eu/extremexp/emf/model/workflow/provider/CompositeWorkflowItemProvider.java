/**
 */
package eu.extremexp.emf.model.workflow.provider;

import eu.extremexp.emf.model.workflow.CompositeWorkflow;
import eu.extremexp.emf.model.workflow.WorkflowFactory;
import eu.extremexp.emf.model.workflow.WorkflowPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eu.extremexp.emf.model.workflow.CompositeWorkflow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeWorkflowItemProvider extends WorkflowItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeWorkflowItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WorkflowPackage.Literals.COMPOSITE_WORKFLOW__NODE);
			childrenFeatures.add(WorkflowPackage.Literals.COMPOSITE_WORKFLOW__LINKS);
			childrenFeatures.add(WorkflowPackage.Literals.COMPOSITE_WORKFLOW__DATA_LINKS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CompositeWorkflow.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositeWorkflow"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CompositeWorkflow) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_CompositeWorkflow_type")
				: getString("_UI_CompositeWorkflow_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CompositeWorkflow.class)) {
		case WorkflowPackage.COMPOSITE_WORKFLOW__NODE:
		case WorkflowPackage.COMPOSITE_WORKFLOW__LINKS:
		case WorkflowPackage.COMPOSITE_WORKFLOW__DATA_LINKS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.COMPOSITE_WORKFLOW__NODE,
				WorkflowFactory.eINSTANCE.createTask()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.COMPOSITE_WORKFLOW__NODE,
				WorkflowFactory.eINSTANCE.createParallel()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.COMPOSITE_WORKFLOW__NODE,
				WorkflowFactory.eINSTANCE.createExclusive()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.COMPOSITE_WORKFLOW__NODE,
				WorkflowFactory.eINSTANCE.createInclusive()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.COMPOSITE_WORKFLOW__NODE,
				WorkflowFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.COMPOSITE_WORKFLOW__NODE,
				WorkflowFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.COMPOSITE_WORKFLOW__LINKS,
				WorkflowFactory.eINSTANCE.createConditionalLink()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.COMPOSITE_WORKFLOW__LINKS,
				WorkflowFactory.eINSTANCE.createRegularLink()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.COMPOSITE_WORKFLOW__LINKS,
				WorkflowFactory.eINSTANCE.createExceptionalLink()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.COMPOSITE_WORKFLOW__DATA_LINKS,
				WorkflowFactory.eINSTANCE.createDataLink()));
	}

}