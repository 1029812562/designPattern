package com.learn.designpattern.models.adapter;

/**
 *
 * @author zhengxc
 * @date 2019/9/20
 */
public class TwoSocketImpl implements TwoSocketInter{

    @Override
    public void twoSocketUse() {
        System.out.println("i am twoSocketUse ");
    }
}
