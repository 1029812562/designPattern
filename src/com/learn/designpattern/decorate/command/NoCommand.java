package com.learn.designpattern.decorate.command;

/**
 * Created by zhengxc on 2019/9/19.
 */
public class NoCommand implements Command{

    @Override
    public void execute() {
        System.out.println("err no command");
    }

    @Override
    public void unDo() {
        System.out.println("err no command");
    }
}
