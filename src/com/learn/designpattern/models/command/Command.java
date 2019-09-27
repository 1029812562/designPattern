package com.learn.designpattern.models.command;

/**
 *
 * @author zhengxc
 * @date 2019/9/19
 */
public interface Command {

    public abstract void execute();

    public abstract void unDo();

}
