package com.learn.designpattern.decorate.factoryabstract;

/**
 *
 * 抽象工厂 抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品
 * 抽象工厂 工厂也是它生产的
 * @author zhengxc
 * @date 2019/9/23
 */
public abstract class AbstractFactory {

    abstract IColor getColor(String id);

    abstract IShape getShape(String id);

}
