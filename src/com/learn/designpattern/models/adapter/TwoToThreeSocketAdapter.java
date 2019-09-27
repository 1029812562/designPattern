package com.learn.designpattern.models.adapter;

/**
 *
 * @author zhengxc
 * @date 2019/9/20
 */
public class TwoToThreeSocketAdapter implements TwoSocketInter{

    private ThreeSocketInter threeSocketInter;

    public TwoToThreeSocketAdapter(ThreeSocketInter threeSocketInter) {
        this.threeSocketInter = threeSocketInter;
    }

    @Override
    public void twoSocketUse() {
        threeSocketInter.threeSocketInter();
    }
}
