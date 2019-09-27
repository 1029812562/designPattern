package com.learn.designpattern.models.visitor;

/**
 * Created by zhengxc on 2019/9/25.
 */
public abstract class Element {

    public abstract void accept(Visitor visitor);

}
