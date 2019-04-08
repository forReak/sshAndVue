package com.furao.sshVue.entity;

public class RespMap {

    private boolean flag;
    private Object result;
    private String message;

    public RespMap() {
    }

    public RespMap(boolean flag, Object result, String message) {
        this.flag = flag;
        this.result = result;
        this.message = message;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
