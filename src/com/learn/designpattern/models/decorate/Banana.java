package com.learn.designpattern.models.decorate;

/**
 *
 * @author zhengxc
 * @date 2019/9/19
 */
public class Banana extends AbstractFruit {

    @Override
    public String getDesc() {
        return "Banana";
    }

    @Override
    public double cost() {
        return 3;
    }
}
