package com.learn.designpattern.models.proxy;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class Eat implements IEat{

    @Override
    public EatRsp eat(EatDto eatDto) {
        System.out.println("i am eating "+eatDto.getName());
        return new EatRsp();

    }
}
