package com.learn.designpattern.decorate;

/**
 *
 * @author zhengxc
 * @date 2019/9/19
 */
public class Apple extends AbstractFruit {

    @Override
    public String getDesc() {
        return "apple";
    }

    @Override
    public double cost() {
        return 10;
    }
}
