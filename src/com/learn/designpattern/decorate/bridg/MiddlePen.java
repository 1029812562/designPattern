package com.learn.designpattern.decorate.bridg;

/**
 *
 * 扩展抽象画角色
 * @author zhengxc
 * @date 2019/9/25
 */
public class MiddlePen extends Pen{

    @Override
    public void draw(String name) {
        String penType = "中号毛笔绘制";
        this.color.bepaint(penType, name);
    }
}
