package com.learn.designpattern.models.memento;

/**
 *
 * 多个备忘录的整合
 * Created by zhengxc on 2019/9/25.
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
