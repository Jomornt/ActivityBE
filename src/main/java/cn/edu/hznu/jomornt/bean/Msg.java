package cn.edu.hznu.jomornt.bean;

import java.util.HashMap;
import java.util.Map;

public class Msg {
    private int code;
    private String msg;
    private Map<String,Object> data = new HashMap<String,Object>();

    public static Msg success(String msg){
        Msg result = new Msg();
        result.setCode(200);
        result.setMsg(msg);
        return result;
    }
    public static Msg unLogin(){
        Msg result = new Msg();
        result.setCode(300);
        result.setMsg("未登录");
        return result;
    }

    public static Msg fail(String msg){
        Msg result = new Msg();
        result.setCode(400);
        result.setMsg(msg);
        return result;
    }

    public Msg add(String key, Object value){
        this.getData().put(key,value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
