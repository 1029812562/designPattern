package com.learn.designpattern.models.bridg;

/**
 *
 * 抽象化角色
 *
 * 某些类具有两个或多个维度的变化 如图形可按形状分和颜色分
 * 如果使用继承实现则需要m*n个子类
 *
 * 桥接设计模式 两个维度
 * 定义一个抽象类 并包含一个实现化的引用
 * @author zhengxc
 * @date 2019/9/25
 */
public abstract class Pen {

    protected Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(String name);

}
