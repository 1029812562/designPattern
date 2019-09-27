package com.learn.designpattern.models.memento;

/**
 *
 * @author zhengxc
 * @date 2019/9/25
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restore(Memento memento){
        this.setState(memento.getState());
    }

}
