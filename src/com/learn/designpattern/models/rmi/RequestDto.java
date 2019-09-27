package com.learn.designpattern.models.rmi;

import java.io.Serializable;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class RequestDto<T extends MathRequest> implements Serializable{

    T request;

    public T getRequest() {
        return request;
    }

    public void setRequest(T request) {
        this.request = request;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RequestDto{");
        sb.append("request=").append(request);
        sb.append(", parent: [").append(super.toString()).append(']');
        sb.append('}');
        return sb.toString();
    }
}
