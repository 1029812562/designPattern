package com.learn.designpattern.decorate.state;

/**
 * Created by zhengxc on 2019/9/20.
 */
public class Test {

    public static void main(String[] args) {
        PayContext payContext = new PayContext();
        payContext.doNext();
    }

}
