package com.learn.designpattern.decorate.adapter;

/**
 *
 * 适配器模式 适配器类需要实现目标类的接口并且适配器类组和了被适配器类的对象 从而由其代理处理请求
 * 统一接口的作用
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
