package com.learn.designpattern.models.state;

/**
 * Created by zhengxc on 2019/9/20.
 */
public class YqWcSuccess extends AbstractState{

    public YqWcSuccess(PayContext abstractContext) {
        super(abstractContext);
    }

    @Override
    public void doNext(int result) {
        throw new UnsupportedOperationException();
    }

    @Override
    public EService getNextService() {
        return null;
    }
}
