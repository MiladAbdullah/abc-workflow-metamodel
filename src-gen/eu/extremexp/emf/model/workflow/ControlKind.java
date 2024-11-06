/**
 */
package eu.extremexp.emf.model.workflow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.extremexp.emf.model.workflow.WorkflowPackage#getControlKind()
 * @model
 * @generated
 */
public enum ControlKind implements Enumerator {
	/**
	 * The '<em><b>AUTOMATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOMATED_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOMATED(0, "AUTOMATED", "AUTOMATED"),

	/**
	 * The '<em><b>EXPLICIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLICIT(1, "EXPLICIT", "EXPLICIT");

	/**
	 * The '<em><b>AUTOMATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOMATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTOMATED_VALUE = 0;

	/**
	 * The '<em><b>EXPLICIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPLICIT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Control Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControlKind[] VALUES_ARRAY = new ControlKind[] { AUTOMATED, EXPLICIT, };

	/**
	 * A public read-only list of all the '<em><b>Control Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControlKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Control Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlKind get(int value) {
		switch (value) {
		case AUTOMATED_VALUE:
			return AUTOMATED;
		case EXPLICIT_VALUE:
			return EXPLICIT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ControlKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ControlKind
