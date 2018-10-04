package com.luopm.photome.model;

public class ResponseUtil {
    int rsultCode;
    String resultMsg;
    Object resultObject;

    public ResponseUtil(){}

    public ResponseUtil(int resultCode,String resultMsg,Object resultObject){
        this.rsultCode = resultCode;
        this.resultMsg = resultMsg;
        this.resultObject = resultObject;
    }
    public int getRsultCode() {
        return rsultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public Object getResultObject() {
        return resultObject;
    }

    public void setRsultCode(int rsultCode) {
        this.rsultCode = rsultCode;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public void setResultObject(Object resultObject) {
        this.resultObject = resultObject;
    }
}