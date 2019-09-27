package com.learn.designpattern.models.bridg;

/**
 *
 * 具体实现化角色
 * @author zhengxc
 * @date 2019/9/25
 */
public class Green implements Color {

    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "绿色的" + name + ".");

    }
}
