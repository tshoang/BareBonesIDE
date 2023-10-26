/**
 * generated by Xtext 2.27.0
 */
package ac.soton.java.barebones2.bareBones;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Associative Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.java.barebones2.bareBones.AssociativePredicate#getLeft <em>Left</em>}</li>
 *   <li>{@link ac.soton.java.barebones2.bareBones.AssociativePredicate#getTag <em>Tag</em>}</li>
 *   <li>{@link ac.soton.java.barebones2.bareBones.AssociativePredicate#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see ac.soton.java.barebones2.bareBones.BareBonesPackage#getAssociativePredicate()
 * @model
 * @generated
 */
public interface AssociativePredicate extends Formula
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Formula)
   * @see ac.soton.java.barebones2.bareBones.BareBonesPackage#getAssociativePredicate_Left()
   * @model containment="true"
   * @generated
   */
  Formula getLeft();

  /**
   * Sets the value of the '{@link ac.soton.java.barebones2.bareBones.AssociativePredicate#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Formula value);

  /**
   * Returns the value of the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' attribute.
   * @see #setTag(String)
   * @see ac.soton.java.barebones2.bareBones.BareBonesPackage#getAssociativePredicate_Tag()
   * @model
   * @generated
   */
  String getTag();

  /**
   * Sets the value of the '{@link ac.soton.java.barebones2.bareBones.AssociativePredicate#getTag <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag</em>' attribute.
   * @see #getTag()
   * @generated
   */
  void setTag(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Formula)
   * @see ac.soton.java.barebones2.bareBones.BareBonesPackage#getAssociativePredicate_Right()
   * @model containment="true"
   * @generated
   */
  Formula getRight();

  /**
   * Sets the value of the '{@link ac.soton.java.barebones2.bareBones.AssociativePredicate#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Formula value);

} // AssociativePredicate