package com.learn.designpattern.models.visitor;

/**
 * Created by zhengxc on 2019/9/25.
 */
public class Test {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        Element elementA = new ElementA();
        Element elementB = new ElementB();
        objectStructure.addElement(elementA);
        objectStructure.addElement(elementB);
        Visitor visitor = new VistorA();
        objectStructure.handleRequest(visitor);
    }

}
