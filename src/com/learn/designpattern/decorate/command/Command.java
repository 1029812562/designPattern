package com.learn.designpattern.decorate.command;

/**
 *
 * @author zhengxc
 * @date 2019/9/19
 */
public interface Command {

    public abstract void execute();

    public abstract void unDo();

}
