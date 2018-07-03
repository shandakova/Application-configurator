/**
 * generated by Xtext 2.14.0
 */
package ru.spbstu.application.configurator.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.spbstu.application.configurator.myDsl.Application#getFeatures1 <em>Features1</em>}</li>
 *   <li>{@link ru.spbstu.application.configurator.myDsl.Application#getFeatures <em>Features</em>}</li>
 *   <li>{@link ru.spbstu.application.configurator.myDsl.Application#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see ru.spbstu.application.configurator.myDsl.MyDslPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject
{
  /**
   * Returns the value of the '<em><b>Features1</b></em>' containment reference list.
   * The list contents are of type {@link ru.spbstu.application.configurator.myDsl.FeatureName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features1</em>' containment reference list.
   * @see ru.spbstu.application.configurator.myDsl.MyDslPackage#getApplication_Features1()
   * @model containment="true"
   * @generated
   */
  EList<FeatureName> getFeatures1();

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link ru.spbstu.application.configurator.myDsl.ArchiveTipe}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see ru.spbstu.application.configurator.myDsl.MyDslPackage#getApplication_Features()
   * @model containment="true"
   * @generated
   */
  EList<ArchiveTipe> getFeatures();

  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference list.
   * @see ru.spbstu.application.configurator.myDsl.MyDslPackage#getApplication_Feature()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getFeature();

} // Application