package com.learn.designpattern.decorate.factory;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class Red implements IColor {

    @Override
    public void fill() {
        System.out.println("i am red");
    }
}
