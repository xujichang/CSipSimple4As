/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public enum pjsua_med_tp_st {
  PJSUA_MED_TP_NULL,
  PJSUA_MED_TP_CREATING,
  PJSUA_MED_TP_IDLE,
  PJSUA_MED_TP_INIT,
  PJSUA_MED_TP_RUNNING,
  PJSUA_MED_TP_DISABLED;

  public final int swigValue() {
    return swigValue;
  }

  public static pjsua_med_tp_st swigToEnum(int swigValue) {
    pjsua_med_tp_st[] swigValues = pjsua_med_tp_st.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (pjsua_med_tp_st swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + pjsua_med_tp_st.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private pjsua_med_tp_st() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private pjsua_med_tp_st(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private pjsua_med_tp_st(pjsua_med_tp_st swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

