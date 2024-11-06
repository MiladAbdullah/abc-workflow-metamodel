/**
 */
package eu.extremexp.emf.model.workflow.impl;

import eu.extremexp.emf.model.workflow.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowFactoryImpl extends EFactoryImpl implements WorkflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkflowFactory init() {
		try {
			WorkflowFactory theWorkflowFactory = (WorkflowFactory) EPackage.Registry.INSTANCE
					.getEFactory(WorkflowPackage.eNS_URI);
			if (theWorkflowFactory != null) {
				return theWorkflowFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case WorkflowPackage.INPUT_DATA:
			return createInputData();
		case WorkflowPackage.OUTPUT_DATA:
			return createOutputData();
		case WorkflowPackage.METRIC:
			return createMetric();
		case WorkflowPackage.PARAMETER:
			return createParameter();
		case WorkflowPackage.ARRAY:
			return createArray();
		case WorkflowPackage.STRUCTURE:
			return createStructure();
		case WorkflowPackage.FIELD:
			return createField();
		case WorkflowPackage.TASK:
			return createTask();
		case WorkflowPackage.CONDITIONAL_LINK:
			return createConditionalLink();
		case WorkflowPackage.REGULAR_LINK:
			return createRegularLink();
		case WorkflowPackage.EXCEPTIONAL_LINK:
			return createExceptionalLink();
		case WorkflowPackage.GROUP:
			return createGroup();
		case WorkflowPackage.META_DATA:
			return createMetaData();
		case WorkflowPackage.PARALLEL:
			return createParallel();
		case WorkflowPackage.EXCLUSIVE:
			return createExclusive();
		case WorkflowPackage.INCLUSIVE:
			return createInclusive();
		case WorkflowPackage.JOIN:
			return createJoin();
		case WorkflowPackage.EVENT:
			return createEvent();
		case WorkflowPackage.PRIMITIVE_TYPE:
			return createPrimitiveType();
		case WorkflowPackage.ROOT:
			return createROOT();
		case WorkflowPackage.CONDITION:
			return createCondition();
		case WorkflowPackage.EXPERIMENT:
			return createExperiment();
		case WorkflowPackage.CASE:
			return createCase();
		case WorkflowPackage.ASSEMBLED_WORFLOW:
			return createAssembledWorflow();
		case WorkflowPackage.SUBSTITUTED_TASK:
			return createSubstitutedTask();
		case WorkflowPackage.COMPOSITE_WORKFLOW:
			return createCompositeWorkflow();
		case WorkflowPackage.TASK_SPECIFICATION:
			return createTaskSpecification();
		case WorkflowPackage.INTENT_REF:
			return createIntentRef();
		case WorkflowPackage.CONTROL:
			return createControl();
		case WorkflowPackage.EXPERIMENTATION_SPACE:
			return createExperimentationSpace();
		case WorkflowPackage.PARAMETER_VALUE:
			return createParameterValue();
		case WorkflowPackage.TASK_CONFIGURATION:
			return createTaskConfiguration();
		case WorkflowPackage.CONTROL_ELEMENT:
			return createControlElement();
		case WorkflowPackage.DATA_LINK:
			return createDataLink();
		case WorkflowPackage.TASK_DATA:
			return createTaskData();
		case WorkflowPackage.VALUE_CONSTRAINT:
			return createValueConstraint();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case WorkflowPackage.EVENT_VALUE:
			return createEventValueFromString(eDataType, initialValue);
		case WorkflowPackage.PRIMITIVE:
			return createPrimitiveFromString(eDataType, initialValue);
		case WorkflowPackage.CONTROL_KIND:
			return createControlKindFromString(eDataType, initialValue);
		case WorkflowPackage.METRIC_KIND:
			return createMetricKindFromString(eDataType, initialValue);
		case WorkflowPackage.NEW_DATA_TYPE3:
			return createNewDataType3FromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case WorkflowPackage.EVENT_VALUE:
			return convertEventValueToString(eDataType, instanceValue);
		case WorkflowPackage.PRIMITIVE:
			return convertPrimitiveToString(eDataType, instanceValue);
		case WorkflowPackage.CONTROL_KIND:
			return convertControlKindToString(eDataType, instanceValue);
		case WorkflowPackage.METRIC_KIND:
			return convertMetricKindToString(eDataType, instanceValue);
		case WorkflowPackage.NEW_DATA_TYPE3:
			return convertNewDataType3ToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputData createInputData() {
		InputDataImpl inputData = new InputDataImpl();
		return inputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputData createOutputData() {
		OutputDataImpl outputData = new OutputDataImpl();
		return outputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure createStructure() {
		StructureImpl structure = new StructureImpl();
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalLink createConditionalLink() {
		ConditionalLinkImpl conditionalLink = new ConditionalLinkImpl();
		return conditionalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularLink createRegularLink() {
		RegularLinkImpl regularLink = new RegularLinkImpl();
		return regularLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionalLink createExceptionalLink() {
		ExceptionalLinkImpl exceptionalLink = new ExceptionalLinkImpl();
		return exceptionalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaData createMetaData() {
		MetaDataImpl metaData = new MetaDataImpl();
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parallel createParallel() {
		ParallelImpl parallel = new ParallelImpl();
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exclusive createExclusive() {
		ExclusiveImpl exclusive = new ExclusiveImpl();
		return exclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inclusive createInclusive() {
		InclusiveImpl inclusive = new InclusiveImpl();
		return inclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROOT createROOT() {
		ROOTImpl root = new ROOTImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Experiment createExperiment() {
		ExperimentImpl experiment = new ExperimentImpl();
		return experiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssembledWorflow createAssembledWorflow() {
		AssembledWorflowImpl assembledWorflow = new AssembledWorflowImpl();
		return assembledWorflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutedTask createSubstitutedTask() {
		SubstitutedTaskImpl substitutedTask = new SubstitutedTaskImpl();
		return substitutedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeWorkflow createCompositeWorkflow() {
		CompositeWorkflowImpl compositeWorkflow = new CompositeWorkflowImpl();
		return compositeWorkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSpecification createTaskSpecification() {
		TaskSpecificationImpl taskSpecification = new TaskSpecificationImpl();
		return taskSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentRef createIntentRef() {
		IntentRefImpl intentRef = new IntentRefImpl();
		return intentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentationSpace createExperimentationSpace() {
		ExperimentationSpaceImpl experimentationSpace = new ExperimentationSpaceImpl();
		return experimentationSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue createParameterValue() {
		ParameterValueImpl parameterValue = new ParameterValueImpl();
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskConfiguration createTaskConfiguration() {
		TaskConfigurationImpl taskConfiguration = new TaskConfigurationImpl();
		return taskConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlElement createControlElement() {
		ControlElementImpl controlElement = new ControlElementImpl();
		return controlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLink createDataLink() {
		DataLinkImpl dataLink = new DataLinkImpl();
		return dataLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskData createTaskData() {
		TaskDataImpl taskData = new TaskDataImpl();
		return taskData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueConstraint createValueConstraint() {
		ValueConstraintImpl valueConstraint = new ValueConstraintImpl();
		return valueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventValue createEventValueFromString(EDataType eDataType, String initialValue) {
		EventValue result = EventValue.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primitive createPrimitiveFromString(EDataType eDataType, String initialValue) {
		Primitive result = Primitive.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlKind createControlKindFromString(EDataType eDataType, String initialValue) {
		ControlKind result = ControlKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricKind createMetricKindFromString(EDataType eDataType, String initialValue) {
		MetricKind result = MetricKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createNewDataType3FromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNewDataType3ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowPackage getWorkflowPackage() {
		return (WorkflowPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkflowPackage getPackage() {
		return WorkflowPackage.eINSTANCE;
	}

} //WorkflowFactoryImpl
