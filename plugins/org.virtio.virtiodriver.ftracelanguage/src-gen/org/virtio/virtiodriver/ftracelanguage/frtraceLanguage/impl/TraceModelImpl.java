/**
 * generated by Xtext 2.21.0
 */
package org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.FrtraceLanguagePackage;
import org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.Trace;
import org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.TraceModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.impl.TraceModelImpl#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceModelImpl extends MinimalEObjectImpl.Container implements TraceModel
{
  /**
   * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraces()
   * @generated
   * @ordered
   */
  protected EList<Trace> traces;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraceModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FrtraceLanguagePackage.Literals.TRACE_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Trace> getTraces()
  {
    if (traces == null)
    {
      traces = new EObjectContainmentEList<Trace>(Trace.class, this, FrtraceLanguagePackage.TRACE_MODEL__TRACES);
    }
    return traces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FrtraceLanguagePackage.TRACE_MODEL__TRACES:
        return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FrtraceLanguagePackage.TRACE_MODEL__TRACES:
        return getTraces();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FrtraceLanguagePackage.TRACE_MODEL__TRACES:
        getTraces().clear();
        getTraces().addAll((Collection<? extends Trace>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FrtraceLanguagePackage.TRACE_MODEL__TRACES:
        getTraces().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FrtraceLanguagePackage.TRACE_MODEL__TRACES:
        return traces != null && !traces.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TraceModelImpl
