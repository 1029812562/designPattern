package com.learn.designpattern.decorate.memento;

/**
 *
 * 备忘录设计模式将当前状态保存以便以后复盘
 * 比如游戏场景存盘
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
