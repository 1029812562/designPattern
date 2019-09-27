package com.learn.designpattern.models.memento;

/**
 * Created by zhengxc on 2019/9/25.
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
