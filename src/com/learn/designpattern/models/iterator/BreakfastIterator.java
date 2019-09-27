package com.learn.designpattern.models.iterator;

/**
 * 迭代器设计模式 迭代器具体实现需要传入参与迭代的容器类
 * @author zhengxc
 * @date 2019/9/20
 */
public class BreakfastIterator implements Iterator {

    private int index = 0;

    private MenuItem[] menuItems;

    private int maxItem = 0;

    public BreakfastIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        maxItem = menuItems.length;
    }

    @Override
    public boolean hasNext() {
        return maxItem > index;
    }

    @Override
    public Object next() {
        Object obj = menuItems[index];
        index ++;
        return obj;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
