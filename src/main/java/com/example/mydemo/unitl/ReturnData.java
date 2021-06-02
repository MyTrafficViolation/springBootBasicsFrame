package com.example.mydemo.unitl;

public class ReturnData {
    private int code;
    private Object data;
    

    public ReturnData() {
        this.code = 0;
        this.data = "操作不明！";
    }
    public ReturnData(int code) {
        this.code = code;
        if(code == 0 ){
            this.data = "操作成功!";
        }else {
            this.data = "操作失败!";
        }
    }

    public ReturnData(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
