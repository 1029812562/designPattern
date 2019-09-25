package com.learn.designpattern.decorate.bridg;

/**
 * Created by zhengxc on 2019/9/25.
 */
public class Red implements Color {

    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "红色的" + name + ".");
    }
}
