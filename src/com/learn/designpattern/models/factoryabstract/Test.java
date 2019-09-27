package com.learn.designpattern.models.factoryabstract;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class Test {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = (ShapeFactory) FactoryProducer.getFactory("SHAPE");
        Circle circle = (Circle) shapeFactory.getShape("circle");
        System.out.println(circle);
    }

}
