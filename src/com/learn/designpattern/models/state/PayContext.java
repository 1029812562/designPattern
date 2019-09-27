package com.learn.designpattern.models.state;

/**
 * Created by zhengxc on 2019/9/20.
 */
public class PayContext {

    public final AbstractState initState = new InitState(this);

    public final AbstractState debitBalanceSuccess = new DebitBalanceSuccess(this);

    public final AbstractState yqOrderSuccess = new YqOrderSuccess(this);

    public final AbstractState yqWcSuccess = new YqWcSuccess(this);

    public static final int SUCCESS = 1;

    public static final int FAIL = 2;

    public static final int PROCESS = 3;

    AbstractState state = initState;

    AbstractState preState = initState;

    ActionService actionService = new ActionService();
    EFunctionService eFunctionService = new EFunctionService(this, actionService);

    public void doNext() {
        EService eService = state.getNextService();
        while (eService != null) {
            int result = eFunctionService.doAction(eService);
            preState = state;
            state.doNext(result);
            eService = state.getNextService();
        }
    }


    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }


}
