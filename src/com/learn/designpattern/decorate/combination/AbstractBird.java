package com.learn.designpattern.decorate.combination;

/**
 * 此处抽象类AbstractBird具有多个两个行为callBehavior以及flyBehavior都是接口类型
 * @author zhengxc
 * @date 2019/9/19
 */
public abstract class AbstractBird {


    private CallBehavior callBehavior;

    private FlyBehavior flyBehavior;

    public String fly(){
        return flyBehavior.fly();
    }

    public String call(){
        return callBehavior.call();
    }

    public CallBehavior getCallBehavior() {
        return callBehavior;
    }

    public void setCallBehavior(CallBehavior callBehavior) {
        this.callBehavior = callBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
