package com.learn.designpattern.decorate.factory;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class Square implements IShape {

    @Override
    public void draw() {
        System.out.println("square");
    }
}
