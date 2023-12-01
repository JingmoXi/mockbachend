package com.example.demo.domains;

public class UserMsg {

    private String name;

    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public UserMsg(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }
}
