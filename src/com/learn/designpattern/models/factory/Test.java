package com.learn.designpattern.models.factory;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class Test {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Circle circle =  (Circle) shapeFactory.getShape("circle");
        circle.draw();
    }

}
