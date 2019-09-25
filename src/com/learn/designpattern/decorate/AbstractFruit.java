package com.learn.designpattern.decorate;

/**
 *
 * @author zhengxc
 * @date 2019/9/19
 */
public abstract class AbstractFruit {

    public String desc ="unkonw fruit name";

    public String getDesc(){
        return desc;
    }

    public abstract double cost();

}
