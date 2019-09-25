package com.learn.designpattern.decorate.iterator;

/**
 * Created by zhengxc on 2019/9/20.
 */
public class Test {

    public static void main(String[] args) {

        BreakfastMenu breakfastMenu = new BreakfastMenu();
        MenuItem milk = new MenuItem("milk", 2);
        MenuItem egg = new MenuItem("egg", 1);
        MenuItem cake = new MenuItem("cake", 2);
        breakfastMenu.addMenuItem(milk);
        breakfastMenu.addMenuItem(egg);
        breakfastMenu.addMenuItem(cake);
        Iterator iterator = breakfastMenu.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());;
        }
    }

}
