package com.learn.designpattern.decorate.factoryabstract;


/**
 * Created by zhengxc on 2019/9/23.
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    IColor getColor(String color) {
        return null;
    }

    @Override
    IShape getShape(String id) {
        if("circle".equals(id)){
            return new Circle();
        }else if("rectangle".equals(id)){
            return new Rectangle();
        }else if("square".equals(id)){
            return new Square();
        }
        return null;
    }
}
