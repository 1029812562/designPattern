package com.learn.designpattern.decorate.observer;

/**
 * Created by zhengxc on 2019/9/19.
 */
public class Observer {

    private String id;

    private String name;

    public Observer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void receiveNotify(String msg) {
        System.out.println("id:" + id + "name:" + name + "msg:" + msg);
    }

}
