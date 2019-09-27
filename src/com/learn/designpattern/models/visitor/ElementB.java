package com.learn.designpattern.models.visitor;

/**
 * Created by zhengxc on 2019/9/25.
 */
public class ElementB extends Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }

    public void oper2(){
        System.out.println("oper2 B");
    }
}
