package com.learn.designpattern.decorate.filter.servlet;

import java.io.Serializable;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class Response implements Serializable{

    private Object res;

    public Object getRes() {
        return res;
    }

    public void setRes(Object res) {
        this.res = res;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Response{");
        sb.append("res=").append(res);
        sb.append(", parent: [").append(super.toString()).append(']');
        sb.append('}');
        return sb.toString();
    }
}
