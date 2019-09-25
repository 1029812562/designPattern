package com.learn.designpattern.decorate.iterator;

/**
 * Created by zhengxc on 2019/9/20.
 */
public class BreakfastMenu implements Menu{

    private int maxSize = 6;

    private MenuItem[] menuItems = new MenuItem[maxSize];
    private int sizeIndex = 0;

    public BreakfastMenu() {
    }

    @Override
    public Iterator createIterator() {
        return new BreakfastIterator(menuItems);
    }

    public void addMenuItem(MenuItem menuItem){
        if(sizeIndex >= maxSize){
            throw new IndexOutOfBoundsException();
        }
        menuItems[sizeIndex] = menuItem;
        sizeIndex++;
    }

}
