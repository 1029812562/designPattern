package com.learn.designpattern.models.decorate;

/**
 *
 * @author zhengxc
 * @date 2019/9/19
 */
public class Orange extends AbstractFruit {

    @Override
    public String getDesc() {
        return "Orange";
    }

    @Override
    public double cost() {
        return 0.3;
    }
}
