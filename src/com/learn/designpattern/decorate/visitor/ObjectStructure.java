package com.learn.designpattern.decorate.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * 访问者模式
 * @author zhengxc
 * @date 2019/9/25
 */
public class ObjectStructure {

    //保存所有需要被访问的元素
    private List<Element> elementList = new ArrayList<Element>();

    public void handleRequest(Visitor visitor){
        for (Element element: elementList){
            element.accept(visitor);
        }
    }

    public void addElement(Element element){
        elementList.add(element);
    }

}
