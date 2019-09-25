package com.learn.designpattern.decorate.staticproxy;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class WorkImpl implements Work{

    @Override
    public void work() {
        System.out.println("i am in work");
    }
}
