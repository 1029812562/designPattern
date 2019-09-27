package com.learn.designpattern.models.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class EatInvocationHandler implements InvocationHandler{

    private IEat eat;

    public EatInvocationHandler(IEat eat) {
        this.eat = eat;
    }

    /**
     * method参数表示被代理的方法,args[]表示参数
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("1");
        //work是被代理的实列 args被代理实例的参数
        Object obj = method.invoke(eat, args);
        System.out.println("3");
        return obj;
    }
}
