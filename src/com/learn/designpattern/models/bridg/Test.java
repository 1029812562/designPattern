package com.learn.designpattern.models.bridg;

/**
 * Created by zhengxc on 2019/9/25.
 */
public class Test {

    public static void main(String[] args) {
        Pen pen = new SmallPen();
        pen.setColor(new Red());
        pen.draw("花花");
    }

}
