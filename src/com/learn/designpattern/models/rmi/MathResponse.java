package com.learn.designpattern.models.rmi;

import java.io.Serializable;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class MathResponse implements Serializable{

    private long resultNum;

    public long getResultNum() {
        return resultNum;
    }

    public void setResultNum(long resultNum) {
        this.resultNum = resultNum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MathResponse{");
        sb.append("resultNum=").append(resultNum);
        sb.append(", parent: [").append(super.toString()).append(']');
        sb.append('}');
        return sb.toString();
    }
}
