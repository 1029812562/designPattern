package com.learn.designpattern.decorate.combination;

/**
 *
 * @author zhengxc
 * @date 2019/9/19
 */
public class Sparrow extends AbstractBird {

    public Sparrow() {
        super();
        setCallBehavior(new ZazaCall());
        setFlyBehavior(new LowFly());
    }

}
