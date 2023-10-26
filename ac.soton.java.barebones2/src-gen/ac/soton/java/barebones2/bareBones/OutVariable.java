/**
 * generated by Xtext 2.27.0
 */
package ac.soton.java.barebones2.bareBones;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.java.barebones2.bareBones.OutVariable#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @see ac.soton.java.barebones2.bareBones.BareBonesPackage#getOutVariable()
 * @model
 * @generated
 */
public interface OutVariable extends Statement
{
  /**
   * Returns the value of the '<em><b>Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formula</em>' containment reference.
   * @see #setFormula(Formula)
   * @see ac.soton.java.barebones2.bareBones.BareBonesPackage#getOutVariable_Formula()
   * @model containment="true"
   * @generated
   */
  Formula getFormula();

  /**
   * Sets the value of the '{@link ac.soton.java.barebones2.bareBones.OutVariable#getFormula <em>Formula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formula</em>' containment reference.
   * @see #getFormula()
   * @generated
   */
  void setFormula(Formula value);

} // OutVariable