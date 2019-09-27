package com.learn.designpattern.models.builder;

/**
 * Created by zhengxc on 2019/9/24.
 */
public class OfoBuilder extends Builder{

    private Bike ofoBike = new Bike();

    @Override
    void buildFrame() {
        ofoBike.setiFrame(new Bframe());
    }

    @Override
    void buildSeat() {
        ofoBike.setiSeat(new BSeat());
    }

    @Override
    void buildTire() {
        ofoBike.setItire(new Btire());
    }

    @Override
    Bike createBike() {
        return ofoBike;
    }
}
