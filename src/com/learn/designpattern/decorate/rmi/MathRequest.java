package com.learn.designpattern.decorate.rmi;

import java.io.Serializable;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class MathRequest implements Serializable{

    private long requestNum1;

    private long requestNum2;

    public long getRequestNum1() {
        return requestNum1;
    }

    public void setRequestNum1(long requestNum1) {
        this.requestNum1 = requestNum1;
    }

    public long getRequestNum2() {
        return requestNum2;
    }

    public void setRequestNum2(long requestNum2) {
        this.requestNum2 = requestNum2;
    }
}
