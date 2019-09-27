package com.learn.designpattern.models.factorymethod;

/**
 * Created by zhengxc on 2019/9/24.
 */
public interface ILoggerFactory {

    ILogger getLogger(String name);

}
