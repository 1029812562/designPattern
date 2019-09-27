package com.learn.designpattern.models.factorymethod;

/**
 * Created by zhengxc on 2019/9/24.
 */
public class LoggerFactory {

    public static ILogger getLogger(String name){
        ILoggerFactory log4jFactory = getILoggerFactory();
        return log4jFactory.getLogger(name);
    }

    private static ILoggerFactory getILoggerFactory(){
        return new Log4jFactory();
    }

}
