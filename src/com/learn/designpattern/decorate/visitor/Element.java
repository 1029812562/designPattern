package com.learn.designpattern.decorate.visitor;

/**
 * Created by zhengxc on 2019/9/25.
 */
public abstract class Element {

    public abstract void accept(Visitor visitor);

}
