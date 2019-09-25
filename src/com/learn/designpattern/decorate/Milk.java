package com.learn.designpattern.decorate;

/**
 *
 * @author zhengxc
 * @date 2019/9/19
 */
public class Milk extends CondimentDecorator{

    private AbstractFruit fruit;

    public Milk(AbstractFruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public String getDesc() {
        return fruit.getDesc() +", milk";
    }

    @Override
    public double cost() {
        return 2 + fruit.cost();
    }
}
