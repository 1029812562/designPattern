package com.learn.designpattern.models.factorymethod;

/**
 * Created by zhengxc on 2019/9/24.
 */
public class Slf4jLog4jAdapter implements ILogger{

    private Log4jLogger log4jLogger;

    public Slf4jLog4jAdapter(Log4jLogger log4jLogger) {
        this.log4jLogger = log4jLogger;
    }

    @Override
    public void info(String msg) {
        log4jLogger.infoLog4j(msg);
    }

    @Override
    public void trace(String msg) {
        log4jLogger.traceLog4j(msg);
    }

    @Override
    public void warn(String msg) {
        log4jLogger.warnLog4j(msg);
    }
}
