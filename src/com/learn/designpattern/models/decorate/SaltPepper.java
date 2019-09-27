package com.learn.designpattern.models.decorate;

/**
 *
 * 装饰者与被装饰者需要一个共同的基类,
 * 此处SaltPepper继承了AbstractFruit,其他水果类也继承了AbstractFruit
 * @author zhengxc
 * @date 2019/9/19
 */
public class SaltPepper extends CondimentDecorator{

    private AbstractFruit fruit;

    public SaltPepper(AbstractFruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public String getDesc() {
        return fruit.getDesc() + ", saltPepper";
    }

    @Override
    public double cost() {
        return 3+fruit.cost();
    }
}
