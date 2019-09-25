package com.learn.designpattern.decorate.builder;

/**
 * Created by zhengxc on 2019/9/24.
 */
public class ASeat implements ISeat{

    private String seat;

    @Override
    public void setSeat(String seat) {
        this.seat = seat;
    }
}
