package com.xcy.area.utils;

/**
 * Created by small on 2019/6/12.
 */
public class JsonBean {

    private int code;//返回一个状态 成功或者失败
    private Object info;//存储任意类型的数据

    public JsonBean() {
    }

    public JsonBean(int code, Object info) {
        this.code = code;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }
}