package com.learn.designpattern.decorate.proxy;

import java.io.Serializable;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class EatRsp implements Serializable{

    private boolean success =false;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EatRsp{");
        sb.append("success=").append(success);
        sb.append(", parent: [").append(super.toString()).append(']');
        sb.append('}');
        return sb.toString();
    }
}
