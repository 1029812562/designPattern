package com.learn.designpattern.models.factorymethod;

/**
 *
 * @author zhengxc
 * @date 2019/9/24
 */
public class Log4jFactory implements ILoggerFactory{

    @Override
    public ILogger getLogger(String name) {
        Log4jLogger log4jLogger = new Log4jLogger();
        return new Slf4jLog4jAdapter(log4jLogger);
    }
}
