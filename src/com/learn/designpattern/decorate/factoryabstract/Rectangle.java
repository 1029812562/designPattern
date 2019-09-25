package com.learn.designpattern.decorate.factoryabstract;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
