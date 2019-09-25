package com.learn.designpattern.decorate.observer;

import java.util.UUID;

/**
 * Created by zhengxc on 2019/9/19.
 */
public class Test {

    public static void main(String[] args) {
        Observer observer1 = new Observer(UUID.randomUUID().toString(), "1");
        Observer observer2 = new Observer(UUID.randomUUID().toString(), "2");
        Observable subject = new Observable();
        subject.register(observer1);
        subject.register(observer2);
        //接收到消息
        subject.receiveMsg("123232");
        //另外Observable实现了subject而Observer属于观察者

    }

}
