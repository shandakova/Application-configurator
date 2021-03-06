/**
 * generated by Xtext 2.14.0
 */
package ru.spbstu.application.configurator.model.infoProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.spbstu.application.configurator.model.infoProject.Hold#getFeatures1 <em>Features1</em>}</li>
 *   <li>{@link ru.spbstu.application.configurator.model.infoProject.Hold#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.spbstu.application.configurator.model.infoProject.InfoProjectPackage#getHold()
 * @model
 * @generated
 */
public interface Hold extends EObject
{
  /**
   * Returns the value of the '<em><b>Features1</b></em>' containment reference list.
   * The list contents are of type {@link ru.spbstu.application.configurator.model.infoProject.FeatureName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features1</em>' containment reference list.
   * @see ru.spbstu.application.configurator.model.infoProject.InfoProjectPackage#getHold_Features1()
   * @model containment="true"
   * @generated
   */
  EList<FeatureName> getFeatures1();

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link ru.spbstu.application.configurator.model.infoProject.HoldType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see ru.spbstu.application.configurator.model.infoProject.InfoProjectPackage#getHold_Features()
   * @model containment="true"
   * @generated
   */
  EList<HoldType> getFeatures();

} // Hold
