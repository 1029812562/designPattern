package com.learn.designpattern.decorate.factory2;

/**
 * Created by zhengxc on 2019/9/24.
 */
public class Log4jLogger {

    void infoLog4j(String msg) {
        System.out.println("infoLog4:" + msg);
    }

    void traceLog4j(String msg) {
        System.out.println("traceLog4j:" + msg);
    }

    void warnLog4j(String msg) {
        System.out.println("warnLog4j:" + msg);
    }

}
