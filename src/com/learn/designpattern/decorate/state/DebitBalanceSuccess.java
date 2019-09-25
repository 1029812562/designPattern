package com.learn.designpattern.decorate.state;

/**
 * @author zhengxc
 * @date 2019/9/20
 */
public class DebitBalanceSuccess extends AbstractState {

    public DebitBalanceSuccess(PayContext abstractContext) {
        super(abstractContext);
    }

    @Override
    public void doNext(int result) {
        switch (result) {
            case PayContext.SUCCESS:
                this.abstractContext.setState(abstractContext.yqOrderSuccess);
                break;
            case PayContext.FAIL:
            case PayContext.PROCESS:
                this.abstractContext.setState(this);
        }
    }

    @Override
    public EService getNextService() {
        return EService.YqOrder;
    }
}
