package com.learn.designpattern.decorate.factory;

/**
 *
 * 简单工厂传入类型直接生产产品
 * @author zhengxc
 * @date 2019/9/23
 */
public class ShapeFactory {

    public IShape getShape(String id){
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
