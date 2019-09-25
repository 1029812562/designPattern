package com.learn.designpattern.decorate.templatemethod;

/**
 * 模板设计模式规定了处理的主流程,处理流程中包含了抽象实现具体实现流程以及空实现
 * 由子类决定具体是否需要重写
 * @author zhengxc
 * @date 2019/9/20
 */
public abstract class AbstractOrdering {

    public void ordering(){
        //参数校验
        validParamter();
        //落单
        insertOrder();
        //日志落单成功
        logging();
        //业务逻辑
        businessResolve();
        //日志处理业务逻辑完成
        logging();
        //调用下游
        invokeNextSys();
        //更新订单状态
        updateOrder();
        //更新状态日志
        logging();
        //写一个hook以便子类可以添加逻辑
        hook();
    }

    private void hook() {
    }

    protected abstract void updateOrder();

    private void invokeNextSys() {
        //使用空实现
    }

    //由子类完成
    protected abstract void businessResolve();

    private void logging() {
    }

    protected abstract void insertOrder();

    protected abstract void validParamter();


}
