package com.learn.designpattern.decorate.factory2;

/**
 * Created by zhengxc on 2019/9/24.
 */
public interface ILoggerFactory {

    ILogger getLogger(String name);

}
