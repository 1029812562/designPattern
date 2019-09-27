package com.learn.designpattern.models.visitor;

/**
 * Created by zhengxc on 2019/9/25.
 */
public class ElementA extends Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }

    public void oper1(){
        System.out.println("oper1 A");
    }


}
