package com.learn.designpattern.decorate.builder;

/**
 * Created by zhengxc on 2019/9/24.
 */
public class Atire implements Itire{

    private String tire;

    @Override
    public void setTire(String tire) {
        this.tire = tire;
    }
}
