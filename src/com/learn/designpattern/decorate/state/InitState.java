package com.learn.designpattern.decorate.state;

/**
 * Created by zhengxc on 2019/9/20.
 */
public class InitState extends AbstractState {

    public InitState(PayContext abstractContext) {
        super(abstractContext);
    }

    @Override
    public void doNext(int result) {
        switch (result) {
            case PayContext.SUCCESS:
                abstractContext.setState(abstractContext.debitBalanceSuccess);
                break;
            case PayContext.FAIL:
            case PayContext.PROCESS:
                abstractContext.setState(this);
        }
    }

    @Override
    public EService getNextService() {
        return EService.DebitBalance;
    }
}
