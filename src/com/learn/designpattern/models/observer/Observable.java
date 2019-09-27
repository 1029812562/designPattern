package com.learn.designpattern.models.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengxc on 2019/9/19.
 */
public class Observable {

    static List<Observer> observerList = new ArrayList<Observer>();

    List<String> msgLs = new ArrayList<String>();

    public void register(Observer observer){
        observerList.add(observer);
    }

    public void notifyObserver(){
        String msg = msgLs.get(0);
        for (Observer observer : observerList){
            observer.receiveNotify(msg);
        }
    }

    public void receiveMsg(String msg){
        msgLs.add(msg);
        notifyObserver();
    }

}
