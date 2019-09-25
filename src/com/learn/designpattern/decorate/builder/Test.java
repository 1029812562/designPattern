package com.learn.designpattern.decorate.builder;

/**
 * Created by zhengxc on 2019/9/24.
 */
public class Test {

    public static void main(String[] args) {
        OfoBuilder ofoBuilder = new OfoBuilder();
        Director director = new Director(ofoBuilder);
//        director.construct().getiFrame();
    }

}
