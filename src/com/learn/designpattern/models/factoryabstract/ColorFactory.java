package com.learn.designpattern.models.factoryabstract;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class ColorFactory extends AbstractFactory{


    @Override
    IColor getColor(String id) {
        if ("black".equals(id)){
            return new Black();
        }else if("green".equals(id)){
            return new Green();
        }else if("red".equals(id)){
            return new Red();
        }
        return null;
    }

    @Override
    IShape getShape(String id) {
        return null;
    }
}
