package com.learn.designpattern.decorate.state;

import java.security.InvalidParameterException;
import java.util.Random;

/**
 * Created by zhengxc on 2019/9/20.
 */
public class ActionService {

    public int debitBalanceMethod() {
        int n = getResult();
        if(n == PayContext.SUCCESS){
            System.out.println("扣减余额成功");
        }else if(n == PayContext.FAIL){
            System.out.println("扣减余额失败");
        }else if(n == PayContext.PROCESS){
            System.out.println("扣减余额处理中");
        }
        return n;
    }

    public int wcOrderMethod() {
        int n = getResult();
        if(n == PayContext.SUCCESS){
            System.out.println("提现下单成功");
        }else if(n == PayContext.FAIL){
            System.out.println("提现下单失败");
        }else if(n == PayContext.PROCESS){
            System.out.println("提现下单处理中");
        }
        return n;
    }

    public int queryWcStatusMethod() {
        int n = getResult();
        if(n == PayContext.SUCCESS){
            System.out.println("提现成功");
        }else if(n == PayContext.FAIL){
            System.out.println("提现失败");
        }else if(n == PayContext.PROCESS){
            System.out.println("提现处理中");
        }
        return n;
    }

    private int getResult() {
        int result = (int)(Math.random() * 10);
        if (result <= 3) {
            return PayContext.SUCCESS;
        } else if (result <= 6) {
            return PayContext.FAIL;
        } else {
            return PayContext.PROCESS;
        }
    }


}
