package com.learn.designpattern.decorate.state;

/**
 *
 * @author zhengxc
 * @date 2019/9/20
 */
public abstract class AbstractState {

    protected PayContext abstractContext;

    public AbstractState(PayContext abstractContext) {
        this.abstractContext = abstractContext;
    }

    //每一个状态都提供向下一个状态变迁的方法
    public abstract void doNext(int result);

    public abstract EService getNextService();

//    //提供一个从外部动作的方法
//    public abstract void outAction();

}
