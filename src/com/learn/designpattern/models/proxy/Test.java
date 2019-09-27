package com.learn.designpattern.models.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class Test {

    public static void main(String[] args) {
        IEat eat = new Eat();
        //动态创建代理对象
        IEat eatProxy = (IEat) Proxy.newProxyInstance(Test.class.getClassLoader(), Eat.class.getInterfaces(),
                new EatInvocationHandler(eat));
        EatDto eatDto = new EatDto();
        eatDto.setName("egg");
        EatRsp eatRsp = eatProxy.eat(eatDto);
        System.out.println(eatRsp);
    }

}
