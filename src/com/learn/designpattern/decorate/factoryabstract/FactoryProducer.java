package com.learn.designpattern.decorate.factoryabstract;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String type){
        if("SHAPE".equals(type)){
            return new ShapeFactory();
        }else if("COLOR".equals(type)){
            return new ColorFactory();
        }
        return null;
    }

}
