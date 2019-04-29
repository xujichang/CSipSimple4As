/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsua_turn_config {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjsua_turn_config(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjsua_turn_config obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pjsua_turn_config(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEnable_turn(int value) {
    pjsuaJNI.pjsua_turn_config_enable_turn_set(swigCPtr, this, value);
  }

  public int getEnable_turn() {
    return pjsuaJNI.pjsua_turn_config_enable_turn_get(swigCPtr, this);
  }

  public void setTurn_server(pj_str_t value) {
    pjsuaJNI.pjsua_turn_config_turn_server_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getTurn_server() {
    long cPtr = pjsuaJNI.pjsua_turn_config_turn_server_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setTurn_conn_type(pj_turn_tp_type value) {
    pjsuaJNI.pjsua_turn_config_turn_conn_type_set(swigCPtr, this, value.swigValue());
  }

  public pj_turn_tp_type getTurn_conn_type() {
    return pj_turn_tp_type.swigToEnum(pjsuaJNI.pjsua_turn_config_turn_conn_type_get(swigCPtr, this));
  }

  public void setTurn_auth_cred(SWIGTYPE_p_pj_stun_auth_cred value) {
    pjsuaJNI.pjsua_turn_config_turn_auth_cred_set(swigCPtr, this, SWIGTYPE_p_pj_stun_auth_cred.getCPtr(value));
  }

  public SWIGTYPE_p_pj_stun_auth_cred getTurn_auth_cred() {
    return new SWIGTYPE_p_pj_stun_auth_cred(pjsuaJNI.pjsua_turn_config_turn_auth_cred_get(swigCPtr, this), true);
  }

  public pjsua_turn_config() {
    this(pjsuaJNI.new_pjsua_turn_config(), true);
  }

}
