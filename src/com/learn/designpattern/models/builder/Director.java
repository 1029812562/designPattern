package com.learn.designpattern.models.builder;

/**
 * Created by zhengxc on 2019/9/24.
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        builder.buildTire();
        return builder.createBike();
    }
}
