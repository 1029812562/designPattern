package com.learn.designpattern.decorate.state;

/**
 * Created by zhengxc on 2019/9/20.
 */
public class YqOrderSuccess extends AbstractState {

    public YqOrderSuccess(PayContext abstractContext) {
        super(abstractContext);
    }

    @Override
    public void doNext(int result) {
        switch (result) {
            case PayContext.SUCCESS:
                this.abstractContext.setState(abstractContext.yqWcSuccess);
                break;
            case PayContext.FAIL:
            case PayContext.PROCESS:
                this.abstractContext.setState(this);
        }
    }

    @Override
    public EService getNextService() {
        return EService.YqQueryState;
    }
}
