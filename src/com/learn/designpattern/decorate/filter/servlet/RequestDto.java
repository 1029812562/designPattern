package com.learn.designpattern.decorate.filter.servlet;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class RequestDto {

    private String requestData;

    public String getRequestData() {
        return requestData;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RequestDto{");
        sb.append("requestData='").append(requestData).append('\'');
        sb.append(", parent: [").append(super.toString()).append(']');
        sb.append('}');
        return sb.toString();
    }
}
