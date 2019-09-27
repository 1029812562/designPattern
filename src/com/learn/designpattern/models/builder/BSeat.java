package com.learn.designpattern.models.builder;

/**
 * Created by zhengxc on 2019/9/24.
 */
public class BSeat implements ISeat{

    private String seat;

    @Override
    public void setSeat(String seat) {
        this.seat = seat;
    }
}
