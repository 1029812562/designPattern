package com.learn.designpattern.decorate.singleton;

/**
 * 使用懒加载方式实例化需要两次判断并且变量设置为volatile
 * @author zhengxc
 * @date 2019/9/19
 */
public class SingletonDoubleCheck {

    private static volatile SingletonDoubleCheck singletonDoubleCheck;

    private SingletonDoubleCheck() {
    }

    public static SingletonDoubleCheck getInstance() {
        if (singletonDoubleCheck == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (singletonDoubleCheck == null) {
                    singletonDoubleCheck = new SingletonDoubleCheck();
                    return singletonDoubleCheck;
                }
                return singletonDoubleCheck;
            }
        }
        return singletonDoubleCheck;


    }

}
