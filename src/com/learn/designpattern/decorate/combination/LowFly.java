package com.learn.designpattern.decorate.combination;

/**
 *
 * @author zhengxc
 * @date 2019/9/19
 */
public class LowFly implements FlyBehavior{

    @Override
    public String fly() {
        return "low fly";
    }
}
