/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsua_mwi_info {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjsua_mwi_info(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjsua_mwi_info obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pjsua_mwi_info(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEvsub(SWIGTYPE_p_pjsip_evsub value) {
    pjsuaJNI.pjsua_mwi_info_evsub_set(swigCPtr, this, SWIGTYPE_p_pjsip_evsub.getCPtr(value));
  }

  public SWIGTYPE_p_pjsip_evsub getEvsub() {
    long cPtr = pjsuaJNI.pjsua_mwi_info_evsub_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_pjsip_evsub(cPtr, false);
  }

  public void setRdata(SWIGTYPE_p_pjsip_rx_data value) {
    pjsuaJNI.pjsua_mwi_info_rdata_set(swigCPtr, this, SWIGTYPE_p_pjsip_rx_data.getCPtr(value));
  }

  public SWIGTYPE_p_pjsip_rx_data getRdata() {
    long cPtr = pjsuaJNI.pjsua_mwi_info_rdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_pjsip_rx_data(cPtr, false);
  }

  public pjsua_mwi_info() {
    this(pjsuaJNI.new_pjsua_mwi_info(), true);
  }

}