package com.learn.designpattern.models.staticproxy;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class Test {

    public static void main(String[] args) {
        Work work = new WorkImpl();
        Work workProxy = new WorkingProxy(work);
        workProxy.work();

    }

}
