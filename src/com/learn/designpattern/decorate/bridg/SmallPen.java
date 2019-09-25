package com.learn.designpattern.decorate.bridg;

/**
 * Created by zhengxc on 2019/9/25.
 */
public class SmallPen extends Pen{

    @Override
    public void draw(String name) {
        String penType = "小号毛笔绘制";
        this.color.bepaint(penType, name);
    }
}
