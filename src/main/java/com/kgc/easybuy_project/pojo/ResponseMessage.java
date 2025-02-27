package com.kgc.easybuy_project.pojo;

public class ResponseMessage {
    private String code;
    private String msg;
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

//    @Override
//    public String toString() {
//        return "ResponseMessage{" +
//                "code='" + code + '\'' +
//                ", msg='" + msg + '\'' +
//                ", data=" + data +
//                '}';
//    }
}
