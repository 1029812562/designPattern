package com.learn.designpattern.decorate.visitor;

/**
 * Created by zhengxc on 2019/9/25.
 */
public class VisitorB implements Visitor{

    @Override
    public void visitElementA(ElementA elementA) {
        System.out.println("visitorB 访问elementA");
        elementA.oper1();
    }

    @Override
    public void visitElementB(ElementB elementB) {
        System.out.println("visitorB 访问elementB");
        elementB.oper2();
    }
}
