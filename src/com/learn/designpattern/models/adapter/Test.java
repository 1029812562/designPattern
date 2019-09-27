package com.learn.designpattern.models.adapter;

/**
 * Created by zhengxc on 2019/9/20.
 */
public class Test {

    public static void main(String[] args) {
        ThreeSocketImpl threeSocket = new ThreeSocketImpl();
        TwoSocketInter twoToThreeSocketAdapter = new TwoToThreeSocketAdapter(threeSocket);
        twoToThreeSocketAdapter.twoSocketUse();

    }

}
