package com.learn.designpattern.decorate.command;

/**
 * Created by zhengxc on 2019/9/19.
 */
public class TvOffCommand implements Command{

    private Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.tvOff();
    }


    @Override
    public void unDo() {

    }
}
