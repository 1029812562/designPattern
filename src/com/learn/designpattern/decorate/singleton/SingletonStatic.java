package com.learn.designpattern.decorate.singleton;

/**
 *
 * 通过静态代码实现只执行一次,类加载就初始化
 * @author zhengxc
 * @date 2019/9/19
 */
public class SingletonStatic {

    private SingletonStatic() {
    }

    private static SingletonStatic singletonStatic = new SingletonStatic();

    public static SingletonStatic getInstance() {
        return singletonStatic;
    }
}
