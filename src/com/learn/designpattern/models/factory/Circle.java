package com.learn.designpattern.models.factory;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class Circle implements IShape {

    @Override
    public void draw() {
        System.out.println("circl");
    }
}
