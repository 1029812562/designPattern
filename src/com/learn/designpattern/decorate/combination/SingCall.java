package com.learn.designpattern.decorate.combination;

/**
 *
 * @author zhengxc
 * @date 2019/9/19
 */
public class SingCall implements CallBehavior{

    @Override
    public String call() {
        return "sing";
    }
}
