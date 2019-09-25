package com.learn.designpattern.decorate.builder;

/**
 * Created by zhengxc on 2019/9/24.
 */
public class Aframe implements IFrame{

    private String name;

    @Override
    public void setFrame(String frame) {
        this.name = frame;
    }
}
