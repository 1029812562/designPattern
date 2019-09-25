package com.learn.designpattern.decorate.factoryabstract;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class Green implements IColor {

    @Override
    public void fill() {
        System.out.println("green");
    }
}
