/**
 */
package eu.extremexp.emf.model.workflow.impl;

import eu.extremexp.emf.model.workflow.Array;
import eu.extremexp.emf.model.workflow.AssembledWorflow;
import eu.extremexp.emf.model.workflow.Case;
import eu.extremexp.emf.model.workflow.CompositeWorkflow;
import eu.extremexp.emf.model.workflow.Condition;
import eu.extremexp.emf.model.workflow.ConditionalLink;
import eu.extremexp.emf.model.workflow.Control;
import eu.extremexp.emf.model.workflow.ControlElement;
import eu.extremexp.emf.model.workflow.ControlKind;
import eu.extremexp.emf.model.workflow.DataLink;
import eu.extremexp.emf.model.workflow.Event;
import eu.extremexp.emf.model.workflow.EventValue;
import eu.extremexp.emf.model.workflow.ExceptionalLink;
import eu.extremexp.emf.model.workflow.Exclusive;
import eu.extremexp.emf.model.workflow.Experiment;
import eu.extremexp.emf.model.workflow.ExperimentationSpace;
import eu.extremexp.emf.model.workflow.Field;
import eu.extremexp.emf.model.workflow.Group;
import eu.extremexp.emf.model.workflow.Inclusive;
import eu.extremexp.emf.model.workflow.InputData;
import eu.extremexp.emf.model.workflow.IntentRef;
import eu.extremexp.emf.model.workflow.Join;
import eu.extremexp.emf.model.workflow.Link;
import eu.extremexp.emf.model.workflow.MetaData;
import eu.extremexp.emf.model.workflow.Metric;
import eu.extremexp.emf.model.workflow.MetricKind;
import eu.extremexp.emf.model.workflow.Node;
import eu.extremexp.emf.model.workflow.Operator;
import eu.extremexp.emf.model.workflow.OutputData;
import eu.extremexp.emf.model.workflow.Parallel;
import eu.extremexp.emf.model.workflow.Parameter;
import eu.extremexp.emf.model.workflow.ParameterType;
import eu.extremexp.emf.model.workflow.ParameterValue;
import eu.extremexp.emf.model.workflow.Primitive;
import eu.extremexp.emf.model.workflow.PrimitiveType;
import eu.extremexp.emf.model.workflow.RegularLink;
import eu.extremexp.emf.model.workflow.Structure;
import eu.extremexp.emf.model.workflow.SubstitutedTask;
import eu.extremexp.emf.model.workflow.Task;
import eu.extremexp.emf.model.workflow.TaskConfiguration;
import eu.extremexp.emf.model.workflow.TaskData;
import eu.extremexp.emf.model.workflow.TaskSpecification;
import eu.extremexp.emf.model.workflow.ValueConstraint;
import eu.extremexp.emf.model.workflow.Workflow;
import eu.extremexp.emf.model.workflow.WorkflowFactory;
import eu.extremexp.emf.model.workflow.WorkflowPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowPackageImpl extends EPackageImpl implements WorkflowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionalLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inclusiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assembledWorflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substitutedTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeWorkflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentationSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metricKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType newDataType3EDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorkflowPackageImpl() {
		super(eNS_URI, WorkflowFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WorkflowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorkflowPackage init() {
		if (isInited)
			return (WorkflowPackage) EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWorkflowPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WorkflowPackageImpl theWorkflowPackage = registeredWorkflowPackage instanceof WorkflowPackageImpl
				? (WorkflowPackageImpl) registeredWorkflowPackage
				: new WorkflowPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWorkflowPackage.createPackageContents();

		// Initialize created meta-data
		theWorkflowPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWorkflowPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkflowPackage.eNS_URI, theWorkflowPackage);
		return theWorkflowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_Name() {
		return (EAttribute) workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Inputs() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Outputs() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputData() {
		return inputDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputData_Name() {
		return (EAttribute) inputDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputData() {
		return outputDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputData_Name() {
		return (EAttribute) outputDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Name() {
		return (EAttribute) metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Kind() {
		return (EAttribute) metricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetric_MetricType() {
		return (EReference) metricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_DefaultValue() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Type() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Valueconstraint() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterType() {
		return parameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_Name() {
		return (EAttribute) parameterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArray() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_Length() {
		return (EAttribute) arrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_Type() {
		return (EReference) arrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructure() {
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Fields() {
		return (EReference) structureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute) fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Type() {
		return (EReference) fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Description() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_IsAbstract() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_PrimitiveImplementation() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Inputs() {
		return (EReference) taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Outputs() {
		return (EReference) taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Metadata() {
		return (EReference) taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Output() {
		return (EReference) linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Input() {
		return (EReference) linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalLink() {
		return conditionalLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalLink_Condition() {
		return (EAttribute) conditionalLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularLink() {
		return regularLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionalLink() {
		return exceptionalLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionalLink_Event() {
		return (EAttribute) exceptionalLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Name() {
		return (EAttribute) groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Metadata() {
		return (EReference) groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Tasks() {
		return (EReference) groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaData() {
		return metaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaData_Name() {
		return (EAttribute) metaDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaData_Value() {
		return (EAttribute) metaDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallel() {
		return parallelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusive() {
		return exclusiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusive_Condition() {
		return (EReference) exclusiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclusive() {
		return inclusiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInclusive_Conditions() {
		return (EReference) inclusiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Name() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveType_Type() {
		return (EAttribute) primitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROOT() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROOT_Groups() {
		return (EReference) rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROOT_Name() {
		return (EAttribute) rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROOT_Parametertypes() {
		return (EReference) rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROOT_Workflow() {
		return (EReference) rootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Condition() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Cases() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperiment() {
		return experimentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperiment_Intent() {
		return (EReference) experimentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperiment_Control() {
		return (EReference) experimentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperiment_Spaces() {
		return (EReference) experimentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperiment_Workflow() {
		return (EReference) experimentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCase() {
		return caseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCase_Case() {
		return (EAttribute) caseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_Target() {
		return (EReference) caseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssembledWorflow() {
		return assembledWorflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssembledWorflow_SubstitutedTask() {
		return (EReference) assembledWorflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssembledWorflow_Parent() {
		return (EReference) assembledWorflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstitutedTask() {
		return substitutedTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstitutedTask_Name() {
		return (EAttribute) substitutedTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstitutedTask_Task() {
		return (EReference) substitutedTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeWorkflow() {
		return compositeWorkflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeWorkflow_Node() {
		return (EReference) compositeWorkflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeWorkflow_Links() {
		return (EReference) compositeWorkflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeWorkflow_DataLinks() {
		return (EReference) compositeWorkflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskSpecification() {
		return taskSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskSpecification_Implementation() {
		return (EAttribute) taskSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskSpecification_Metrics() {
		return (EReference) taskSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskSpecification_Parameters() {
		return (EReference) taskSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentRef() {
		return intentRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentRef_Ref() {
		return (EAttribute) intentRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Kind() {
		return (EAttribute) controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControl_Control() {
		return (EReference) controlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperimentationSpace() {
		return experimentationSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimentationSpace_Name() {
		return (EAttribute) experimentationSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentationSpace_Worflow() {
		return (EReference) experimentationSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimentationSpace_Strategy() {
		return (EAttribute) experimentationSpaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentationSpace_Parameters() {
		return (EReference) experimentationSpaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentationSpace_Configurations() {
		return (EReference) experimentationSpaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValue() {
		return parameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValue_Value() {
		return (EAttribute) parameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValue_Name() {
		return (EAttribute) parameterValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskConfiguration() {
		return taskConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskConfiguration_Parameters() {
		return (EReference) taskConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskConfiguration_Task() {
		return (EReference) taskConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlElement() {
		return controlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlElement_Space() {
		return (EReference) controlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlElement_Next() {
		return (EReference) controlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataLink() {
		return dataLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataLink_Inputdata() {
		return (EReference) dataLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataLink_Outputdata() {
		return (EReference) dataLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataLink_TaskData() {
		return (EReference) dataLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskData() {
		return taskDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskData_DataName() {
		return (EAttribute) taskDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskData_Task() {
		return (EReference) taskDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueConstraint() {
		return valueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueConstraint_Constraint() {
		return (EAttribute) valueConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventValue() {
		return eventValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitive() {
		return primitiveEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlKind() {
		return controlKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetricKind() {
		return metricKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNewDataType3() {
		return newDataType3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowFactory getWorkflowFactory() {
		return (WorkflowFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		workflowEClass = createEClass(WORKFLOW);
		createEAttribute(workflowEClass, WORKFLOW__NAME);
		createEReference(workflowEClass, WORKFLOW__INPUTS);
		createEReference(workflowEClass, WORKFLOW__OUTPUTS);

		nodeEClass = createEClass(NODE);

		inputDataEClass = createEClass(INPUT_DATA);
		createEAttribute(inputDataEClass, INPUT_DATA__NAME);

		outputDataEClass = createEClass(OUTPUT_DATA);
		createEAttribute(outputDataEClass, OUTPUT_DATA__NAME);

		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__NAME);
		createEAttribute(metricEClass, METRIC__KIND);
		createEReference(metricEClass, METRIC__METRIC_TYPE);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__DEFAULT_VALUE);
		createEReference(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEReference(parameterEClass, PARAMETER__VALUECONSTRAINT);

		parameterTypeEClass = createEClass(PARAMETER_TYPE);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__NAME);

		arrayEClass = createEClass(ARRAY);
		createEAttribute(arrayEClass, ARRAY__LENGTH);
		createEReference(arrayEClass, ARRAY__TYPE);

		structureEClass = createEClass(STRUCTURE);
		createEReference(structureEClass, STRUCTURE__FIELDS);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEReference(fieldEClass, FIELD__TYPE);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__DESCRIPTION);
		createEAttribute(taskEClass, TASK__IS_ABSTRACT);
		createEAttribute(taskEClass, TASK__PRIMITIVE_IMPLEMENTATION);
		createEReference(taskEClass, TASK__INPUTS);
		createEReference(taskEClass, TASK__OUTPUTS);
		createEReference(taskEClass, TASK__METADATA);

		operatorEClass = createEClass(OPERATOR);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__OUTPUT);
		createEReference(linkEClass, LINK__INPUT);

		conditionalLinkEClass = createEClass(CONDITIONAL_LINK);
		createEAttribute(conditionalLinkEClass, CONDITIONAL_LINK__CONDITION);

		regularLinkEClass = createEClass(REGULAR_LINK);

		exceptionalLinkEClass = createEClass(EXCEPTIONAL_LINK);
		createEAttribute(exceptionalLinkEClass, EXCEPTIONAL_LINK__EVENT);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__NAME);
		createEReference(groupEClass, GROUP__METADATA);
		createEReference(groupEClass, GROUP__TASKS);

		metaDataEClass = createEClass(META_DATA);
		createEAttribute(metaDataEClass, META_DATA__NAME);
		createEAttribute(metaDataEClass, META_DATA__VALUE);

		parallelEClass = createEClass(PARALLEL);

		exclusiveEClass = createEClass(EXCLUSIVE);
		createEReference(exclusiveEClass, EXCLUSIVE__CONDITION);

		inclusiveEClass = createEClass(INCLUSIVE);
		createEReference(inclusiveEClass, INCLUSIVE__CONDITIONS);

		joinEClass = createEClass(JOIN);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__NAME);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__TYPE);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__GROUPS);
		createEAttribute(rootEClass, ROOT__NAME);
		createEReference(rootEClass, ROOT__PARAMETERTYPES);
		createEReference(rootEClass, ROOT__WORKFLOW);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__CONDITION);
		createEReference(conditionEClass, CONDITION__CASES);

		experimentEClass = createEClass(EXPERIMENT);
		createEReference(experimentEClass, EXPERIMENT__INTENT);
		createEReference(experimentEClass, EXPERIMENT__CONTROL);
		createEReference(experimentEClass, EXPERIMENT__SPACES);
		createEReference(experimentEClass, EXPERIMENT__WORKFLOW);

		caseEClass = createEClass(CASE);
		createEAttribute(caseEClass, CASE__CASE);
		createEReference(caseEClass, CASE__TARGET);

		assembledWorflowEClass = createEClass(ASSEMBLED_WORFLOW);
		createEReference(assembledWorflowEClass, ASSEMBLED_WORFLOW__SUBSTITUTED_TASK);
		createEReference(assembledWorflowEClass, ASSEMBLED_WORFLOW__PARENT);

		substitutedTaskEClass = createEClass(SUBSTITUTED_TASK);
		createEAttribute(substitutedTaskEClass, SUBSTITUTED_TASK__NAME);
		createEReference(substitutedTaskEClass, SUBSTITUTED_TASK__TASK);

		compositeWorkflowEClass = createEClass(COMPOSITE_WORKFLOW);
		createEReference(compositeWorkflowEClass, COMPOSITE_WORKFLOW__NODE);
		createEReference(compositeWorkflowEClass, COMPOSITE_WORKFLOW__LINKS);
		createEReference(compositeWorkflowEClass, COMPOSITE_WORKFLOW__DATA_LINKS);

		taskSpecificationEClass = createEClass(TASK_SPECIFICATION);
		createEAttribute(taskSpecificationEClass, TASK_SPECIFICATION__IMPLEMENTATION);
		createEReference(taskSpecificationEClass, TASK_SPECIFICATION__METRICS);
		createEReference(taskSpecificationEClass, TASK_SPECIFICATION__PARAMETERS);

		intentRefEClass = createEClass(INTENT_REF);
		createEAttribute(intentRefEClass, INTENT_REF__REF);

		controlEClass = createEClass(CONTROL);
		createEAttribute(controlEClass, CONTROL__KIND);
		createEReference(controlEClass, CONTROL__CONTROL);

		experimentationSpaceEClass = createEClass(EXPERIMENTATION_SPACE);
		createEAttribute(experimentationSpaceEClass, EXPERIMENTATION_SPACE__NAME);
		createEReference(experimentationSpaceEClass, EXPERIMENTATION_SPACE__WORFLOW);
		createEAttribute(experimentationSpaceEClass, EXPERIMENTATION_SPACE__STRATEGY);
		createEReference(experimentationSpaceEClass, EXPERIMENTATION_SPACE__PARAMETERS);
		createEReference(experimentationSpaceEClass, EXPERIMENTATION_SPACE__CONFIGURATIONS);

		parameterValueEClass = createEClass(PARAMETER_VALUE);
		createEAttribute(parameterValueEClass, PARAMETER_VALUE__VALUE);
		createEAttribute(parameterValueEClass, PARAMETER_VALUE__NAME);

		taskConfigurationEClass = createEClass(TASK_CONFIGURATION);
		createEReference(taskConfigurationEClass, TASK_CONFIGURATION__PARAMETERS);
		createEReference(taskConfigurationEClass, TASK_CONFIGURATION__TASK);

		controlElementEClass = createEClass(CONTROL_ELEMENT);
		createEReference(controlElementEClass, CONTROL_ELEMENT__SPACE);
		createEReference(controlElementEClass, CONTROL_ELEMENT__NEXT);

		dataLinkEClass = createEClass(DATA_LINK);
		createEReference(dataLinkEClass, DATA_LINK__INPUTDATA);
		createEReference(dataLinkEClass, DATA_LINK__OUTPUTDATA);
		createEReference(dataLinkEClass, DATA_LINK__TASK_DATA);

		taskDataEClass = createEClass(TASK_DATA);
		createEAttribute(taskDataEClass, TASK_DATA__DATA_NAME);
		createEReference(taskDataEClass, TASK_DATA__TASK);

		valueConstraintEClass = createEClass(VALUE_CONSTRAINT);
		createEAttribute(valueConstraintEClass, VALUE_CONSTRAINT__CONSTRAINT);

		// Create enums
		eventValueEEnum = createEEnum(EVENT_VALUE);
		primitiveEEnum = createEEnum(PRIMITIVE);
		controlKindEEnum = createEEnum(CONTROL_KIND);
		metricKindEEnum = createEEnum(METRIC_KIND);

		// Create data types
		newDataType3EDataType = createEDataType(NEW_DATA_TYPE3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		arrayEClass.getESuperTypes().add(this.getParameterType());
		structureEClass.getESuperTypes().add(this.getParameterType());
		taskEClass.getESuperTypes().add(this.getNode());
		operatorEClass.getESuperTypes().add(this.getNode());
		conditionalLinkEClass.getESuperTypes().add(this.getLink());
		regularLinkEClass.getESuperTypes().add(this.getLink());
		exceptionalLinkEClass.getESuperTypes().add(this.getLink());
		parallelEClass.getESuperTypes().add(this.getOperator());
		exclusiveEClass.getESuperTypes().add(this.getOperator());
		inclusiveEClass.getESuperTypes().add(this.getOperator());
		joinEClass.getESuperTypes().add(this.getOperator());
		eventEClass.getESuperTypes().add(this.getNode());
		primitiveTypeEClass.getESuperTypes().add(this.getParameterType());
		assembledWorflowEClass.getESuperTypes().add(this.getWorkflow());
		compositeWorkflowEClass.getESuperTypes().add(this.getWorkflow());
		taskSpecificationEClass.getESuperTypes().add(this.getWorkflow());

		// Initialize classes, features, and operations; add parameters
		initEClass(workflowEClass, Workflow.class, "Workflow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflow_Name(), ecorePackage.getEString(), "name", null, 0, 1, Workflow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Inputs(), this.getInputData(), null, "inputs", null, 0, -1, Workflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Outputs(), this.getOutputData(), null, "outputs", null, 0, -1, Workflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputDataEClass, InputData.class, "InputData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputData_Name(), ecorePackage.getEString(), "name", null, 0, 1, InputData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputDataEClass, OutputData.class, "OutputData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputData_Name(), ecorePackage.getEString(), "name", null, 0, 1, OutputData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metric.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Kind(), this.getMetricKind(), "kind", null, 0, 1, Metric.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetric_MetricType(), this.getParameterType(), null, "metricType", null, 1, 1, Metric.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1,
				Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Type(), this.getParameterType(), null, "type", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Valueconstraint(), this.getValueConstraint(), null, "valueconstraint", null, 0, 1,
				Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayEClass, Array.class, "Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArray_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Array.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArray_Type(), this.getParameterType(), null, "type", null, 0, 1, Array.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(structureEClass, Structure.class, "Structure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructure_Fields(), this.getField(), null, "fields", null, 0, -1, Structure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Type(), this.getParameterType(), null, "type", null, 0, 1, Field.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Description(), ecorePackage.getEString(), "description", null, 0, 1, Task.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, Task.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_PrimitiveImplementation(), ecorePackage.getEString(), "primitiveImplementation", null, 0,
				1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Inputs(), this.getInputData(), null, "inputs", null, 0, -1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTask_Outputs(), this.getOutputData(), null, "outputs", null, 0, -1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTask_Metadata(), this.getMetaData(), null, "metadata", null, 0, -1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Output(), this.getNode(), null, "output", null, 0, 1, Link.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLink_Input(), this.getNode(), null, "input", null, 0, 1, Link.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(conditionalLinkEClass, ConditionalLink.class, "ConditionalLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionalLink_Condition(), ecorePackage.getEString(), "condition", null, 0, 1,
				ConditionalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(regularLinkEClass, RegularLink.class, "RegularLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(exceptionalLinkEClass, ExceptionalLink.class, "ExceptionalLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExceptionalLink_Event(), ecorePackage.getEString(), "event", null, 0, 1,
				ExceptionalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, Group.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Metadata(), this.getMetaData(), null, "metadata", null, 0, -1, Group.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Group.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(metaDataEClass, MetaData.class, "MetaData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaData_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetaData.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaData_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, MetaData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(exclusiveEClass, Exclusive.class, "Exclusive", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExclusive_Condition(), this.getCondition(), null, "condition", null, 1, -1, Exclusive.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inclusiveEClass, Inclusive.class, "Inclusive", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInclusive_Conditions(), this.getCondition(), null, "conditions", null, 1, -1, Inclusive.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), this.getEventValue(), "name", null, 0, 1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveType_Type(), this.getPrimitive(), "type", null, 0, 1, PrimitiveType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, eu.extremexp.emf.model.workflow.ROOT.class, "ROOT", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROOT_Groups(), this.getGroup(), null, "groups", null, 0, -1,
				eu.extremexp.emf.model.workflow.ROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROOT_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				eu.extremexp.emf.model.workflow.ROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROOT_Parametertypes(), this.getParameterType(), null, "parametertypes", null, 0, -1,
				eu.extremexp.emf.model.workflow.ROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROOT_Workflow(), this.getWorkflow(), null, "workflow", null, 0, -1,
				eu.extremexp.emf.model.workflow.ROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Condition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Cases(), this.getCase(), null, "cases", null, 1, -1, Condition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(experimentEClass, Experiment.class, "Experiment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperiment_Intent(), this.getIntentRef(), null, "intent", null, 1, 1, Experiment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperiment_Control(), this.getControl(), null, "control", null, 1, 1, Experiment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperiment_Spaces(), this.getExperimentationSpace(), null, "spaces", null, 0, -1,
				Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperiment_Workflow(), this.getWorkflow(), null, "workflow", null, 1, 1, Experiment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCase_Case(), ecorePackage.getEString(), "case", null, 0, 1, Case.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_Target(), this.getNode(), null, "target", null, 1, 1, Case.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(assembledWorflowEClass, AssembledWorflow.class, "AssembledWorflow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssembledWorflow_SubstitutedTask(), this.getSubstitutedTask(), null, "substitutedTask", null,
				0, -1, AssembledWorflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssembledWorflow_Parent(), this.getWorkflow(), null, "parent", null, 1, 1,
				AssembledWorflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substitutedTaskEClass, SubstitutedTask.class, "SubstitutedTask", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubstitutedTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubstitutedTask.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstitutedTask_Task(), this.getTask(), null, "task", null, 0, 1, SubstitutedTask.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeWorkflowEClass, CompositeWorkflow.class, "CompositeWorkflow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeWorkflow_Node(), this.getNode(), null, "node", null, 1, -1, CompositeWorkflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeWorkflow_Links(), this.getLink(), null, "links", null, 0, -1,
				CompositeWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeWorkflow_DataLinks(), this.getDataLink(), null, "dataLinks", null, 0, -1,
				CompositeWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskSpecificationEClass, TaskSpecification.class, "TaskSpecification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskSpecification_Implementation(), ecorePackage.getEString(), "implementation", null, 0, 1,
				TaskSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTaskSpecification_Metrics(), this.getMetric(), null, "metrics", null, 0, -1,
				TaskSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskSpecification_Parameters(), this.getParameter(), null, "parameters", null, 0, -1,
				TaskSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intentRefEClass, IntentRef.class, "IntentRef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentRef_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, IntentRef.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControl_Kind(), this.getControlKind(), "kind", null, 0, 1, Control.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Control(), this.getControlElement(), null, "control", null, 0, -1, Control.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experimentationSpaceEClass, ExperimentationSpace.class, "ExperimentationSpace", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperimentationSpace_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ExperimentationSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentationSpace_Worflow(), this.getAssembledWorflow(), null, "worflow", null, 0, 1,
				ExperimentationSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentationSpace_Strategy(), ecorePackage.getEString(), "strategy", null, 0, 1,
				ExperimentationSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentationSpace_Parameters(), this.getParameterValue(), null, "parameters", null, 0, -1,
				ExperimentationSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentationSpace_Configurations(), this.getTaskConfiguration(), null, "configurations",
				null, 0, -1, ExperimentationSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterValueEClass, ParameterValue.class, "ParameterValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, ParameterValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskConfigurationEClass, TaskConfiguration.class, "TaskConfiguration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskConfiguration_Parameters(), this.getParameterValue(), null, "parameters", null, 0, -1,
				TaskConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskConfiguration_Task(), this.getTask(), null, "task", null, 1, 1, TaskConfiguration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlElementEClass, ControlElement.class, "ControlElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlElement_Space(), this.getExperimentationSpace(), null, "space", null, 1, 1,
				ControlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlElement_Next(), this.getControlElement(), null, "next", null, 0, -1,
				ControlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataLinkEClass, DataLink.class, "DataLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataLink_Inputdata(), this.getInputData(), null, "inputdata", null, 0, 1, DataLink.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataLink_Outputdata(), this.getOutputData(), null, "outputdata", null, 0, 1, DataLink.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataLink_TaskData(), this.getTaskData(), null, "taskData", null, 0, -1, DataLink.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskDataEClass, TaskData.class, "TaskData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskData_DataName(), ecorePackage.getEString(), "dataName", null, 0, 1, TaskData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskData_Task(), this.getTask(), null, "task", null, 1, 1, TaskData.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(valueConstraintEClass, ValueConstraint.class, "ValueConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueConstraint_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1,
				ValueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eventValueEEnum, EventValue.class, "EventValue");
		addEEnumLiteral(eventValueEEnum, EventValue.START);
		addEEnumLiteral(eventValueEEnum, EventValue.END);

		initEEnum(primitiveEEnum, Primitive.class, "Primitive");
		addEEnumLiteral(primitiveEEnum, Primitive.NUMBER);
		addEEnumLiteral(primitiveEEnum, Primitive.BOOLEAN);
		addEEnumLiteral(primitiveEEnum, Primitive.STRING);
		addEEnumLiteral(primitiveEEnum, Primitive.BLOB);

		initEEnum(controlKindEEnum, ControlKind.class, "ControlKind");
		addEEnumLiteral(controlKindEEnum, ControlKind.AUTOMATED);
		addEEnumLiteral(controlKindEEnum, ControlKind.EXPLICIT);

		initEEnum(metricKindEEnum, MetricKind.class, "MetricKind");
		addEEnumLiteral(metricKindEEnum, MetricKind.SERIES);
		addEEnumLiteral(metricKindEEnum, MetricKind.SCALAR);

		// Initialize data types
		initEDataType(newDataType3EDataType, Object.class, "NewDataType3", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //WorkflowPackageImpl
