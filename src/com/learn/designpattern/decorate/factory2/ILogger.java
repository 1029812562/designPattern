package com.learn.designpattern.decorate.factory2;

/**
 * Created by zhengxc on 2019/9/24.
 */
public interface ILogger {


    void info(String msg);

    void trace(String msg);

    void warn(String msg);
}
