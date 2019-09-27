package com.learn.designpattern.models.rmi;

import java.io.Serializable;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class ResponseDto<T extends MathResponse> implements Serializable{

    private T response;

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResponseDto{");
        sb.append("response=").append(response);
        sb.append(", parent: [").append(super.toString()).append(']');
        sb.append('}');
        return sb.toString();
    }
}
