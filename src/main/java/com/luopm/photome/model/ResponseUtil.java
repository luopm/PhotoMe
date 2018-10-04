package com.luopm.photome.model;

public class ResponseUtil {
    int resultCode;
    String resultMsg;
    Object resultObject;

    public ResponseUtil(){}

    public ResponseUtil(int resultCode,String resultMsg,Object resultObject){
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.resultObject = resultObject;
    }
    public int getResultCode() {
        return resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public Object getResultObject() {
        return resultObject;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public void setResultObject(Object resultObject) {
        this.resultObject = resultObject;
    }
}