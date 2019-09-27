package com.learn.designpattern.models.builder;

/**
 * Created by zhengxc on 2019/9/24.
 */
public class Bframe implements IFrame{

    private String frame;

    @Override
    public void setFrame(String frame) {
        this.frame = frame;
    }
}
