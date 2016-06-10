/**
 */
package dtu.mbse.groupi.yawl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Join Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dtu.mbse.groupi.yawl.YawlPackage#getJoinTypes()
 * @model
 * @generated
 */
public enum JoinTypes implements Enumerator {
	/**
	 * The '<em><b>Single</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE(1, "single", "single"),

	/**
	 * The '<em><b>XO Rjoin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XO_RJOIN_VALUE
	 * @generated
	 * @ordered
	 */
	XO_RJOIN(2, "XORjoin", "XORjoin"),

	/**
	 * The '<em><b>ORjoin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORJOIN_VALUE
	 * @generated
	 * @ordered
	 */
	ORJOIN(3, "ORjoin", "ORjoin"),

	/**
	 * The '<em><b>AN Djoin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AN_DJOIN_VALUE
	 * @generated
	 * @ordered
	 */
	AN_DJOIN(4, "ANDjoin", "ANDjoin");

	/**
	 * The '<em><b>Single</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Single</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE
	 * @model name="single"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_VALUE = 1;

	/**
	 * The '<em><b>XO Rjoin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XO Rjoin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XO_RJOIN
	 * @model name="XORjoin"
	 * @generated
	 * @ordered
	 */
	public static final int XO_RJOIN_VALUE = 2;

	/**
	 * The '<em><b>ORjoin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORjoin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORJOIN
	 * @model name="ORjoin"
	 * @generated
	 * @ordered
	 */
	public static final int ORJOIN_VALUE = 3;

	/**
	 * The '<em><b>AN Djoin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AN Djoin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AN_DJOIN
	 * @model name="ANDjoin"
	 * @generated
	 * @ordered
	 */
	public static final int AN_DJOIN_VALUE = 4;

	/**
	 * An array of all the '<em><b>Join Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JoinTypes[] VALUES_ARRAY =
		new JoinTypes[] {
			SINGLE,
			XO_RJOIN,
			ORJOIN,
			AN_DJOIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Join Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JoinTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Join Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JoinTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JoinTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Join Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JoinTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JoinTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Join Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JoinTypes get(int value) {
		switch (value) {
			case SINGLE_VALUE: return SINGLE;
			case XO_RJOIN_VALUE: return XO_RJOIN;
			case ORJOIN_VALUE: return ORJOIN;
			case AN_DJOIN_VALUE: return AN_DJOIN;
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
	private JoinTypes(int value, String name, String literal) {
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
	
} //JoinTypes
