package com.learn.designpattern.models.composite;

/**
 * Created by zhengxc on 2019/9/26.
 */
public class Leaf extends Component {

    @Override
    void operation() {
        System.out.println("Leaf operation");
    }
}
