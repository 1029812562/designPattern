package com.learn.designpattern.models.builder;

/**
 * Created by zhengxc on 2019/9/24.
 */
public class Bike {

    private IFrame iFrame;

    private ISeat iSeat;

    private Itire itire;

    public IFrame getiFrame() {
        return iFrame;
    }

    public void setiFrame(IFrame iFrame) {
        this.iFrame = iFrame;
    }

    public ISeat getiSeat() {
        return iSeat;
    }

    public void setiSeat(ISeat iSeat) {
        this.iSeat = iSeat;
    }

    public Itire getItire() {
        return itire;
    }

    public void setItire(Itire itire) {
        this.itire = itire;
    }
}
