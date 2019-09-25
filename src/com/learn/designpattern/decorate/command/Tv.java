package com.learn.designpattern.decorate.command;

/**
 * Created by zhengxc on 2019/9/19.
 */
public class Tv {

    public void tvOn(){
        System.out.println("tvOn");
    }

    public void tvOff(){
        System.out.println("tvOff");
    }

    public void channelToSubject(){
        System.out.println("channelToSubject ");
    }

    public void likeTv(){
        System.out.println("your like tv");
    }

}
