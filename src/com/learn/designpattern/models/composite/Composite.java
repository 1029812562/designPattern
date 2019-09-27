package com.learn.designpattern.models.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengxc on 2019/9/26.
 */
public class Composite extends Component {

    List<Component> componentList = new ArrayList<Component>();

    @Override
    void operation() {
        for (Component component : componentList) {
            component.operation();
        }
        System.out.println("Composite operation");
    }

    @Override
    void add(Component component) {
        componentList.add(component);
    }

    @Override
    void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    Component getChild(int index) {
        return componentList.get(index);
    }
}
