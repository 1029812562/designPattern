package com.learn.designpattern.decorate.state;

import java.security.InvalidParameterException;

/**
 *
 * @author zhengxc
 * @date 2019/9/20
 */
public class EFunctionService {

    private PayContext payContext;

    private ActionService actionService;

    public EFunctionService(PayContext payContext, ActionService actionService) {
        this.payContext = payContext;
        this.actionService = actionService;
    }

    public int doAction(EService eService) {
        switch (eService) {
            case DebitBalance:
                return this.actionService.debitBalanceMethod();
            case YqOrder:
                return this.actionService.wcOrderMethod();
            case YqQueryState:
                return this.actionService.queryWcStatusMethod();
        }
        throw new InvalidParameterException();
    }

}
