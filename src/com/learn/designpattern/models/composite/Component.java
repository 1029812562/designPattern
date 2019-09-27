package com.learn.designpattern.models.composite;

/**
 * Created by zhengxc on 2019/9/26.
 */
public abstract class Component {

    abstract void operation();

    void add(Component component){
        throw new UnsupportedOperationException();
    }

    void remove(Component component){
        throw new UnsupportedOperationException();
    }

    Component getChild(int index){
        throw new UnsupportedOperationException();
    }


}
