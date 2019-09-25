package com.learn.designpattern.decorate.staticproxy;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class WorkingProxy implements Work{

    Work work;

    public WorkingProxy(Work work) {
        this.work = work;
    }

    @Override
    public void work() {
        before();
        work.work();
        after();
    }

    private void before(){
        System.out.println("eat ...");
    }

    private void after(){
        System.out.println("sleep ...");
    }

}
