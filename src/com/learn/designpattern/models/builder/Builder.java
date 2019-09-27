package com.learn.designpattern.models.builder;

/**
 * Created by zhengxc on 2019/9/24.
 */
public abstract class Builder {

    abstract void buildFrame();

    abstract void buildSeat();

    abstract void buildTire();

    abstract Bike createBike();
}
