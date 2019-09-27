package com.learn.designpattern.models.builder;

/**
 * Created by zhengxc on 2019/9/24.
 */
public class MobikeBuilder extends Builder{

    private Bike mobBike = new Bike();

    @Override
    void buildFrame() {
        mobBike.setiFrame(new Aframe());
    }

    @Override
    void buildSeat() {
        mobBike.setiSeat(new ASeat());
    }

    @Override
    void buildTire() {
        mobBike.setItire(new Atire());
    }

    @Override
    Bike createBike() {
        return mobBike;
    }
}
