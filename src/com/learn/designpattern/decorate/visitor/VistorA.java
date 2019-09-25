package com.learn.designpattern.decorate.visitor;

/**
 * Created by zhengxc on 2019/9/25.
 */
public class VistorA implements Visitor {

    @Override
    public void visitElementA(ElementA elementA) {
        System.out.println("visitorA 访问 elementA");
        elementA.oper1();
    }

    @Override
    public void visitElementB(ElementB elementB) {
        System.out.println("visitorA 访问 elementB");
        elementB.oper2();
    }
}
