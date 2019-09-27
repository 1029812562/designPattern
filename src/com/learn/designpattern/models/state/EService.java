package com.learn.designpattern.models.state;

/**
 * Created by zhengxc on 2019/9/20.
 */
public enum EService {

    DebitBalance("1"),

    YqOrder("2"),

    YqQueryState("3");

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    EService(String code) {
        this.code = code;
    }
}
