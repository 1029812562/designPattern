package com.learn.designpattern.decorate.command;

/**
 * Created by zhengxc on 2019/9/19.
 */
public class Light {

    public static String onStatus = "on";

    public static String offStatus = "off";

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void lightOn(){
        System.out.println("light on");
        status = onStatus;
    }

    public void lightOff(){
        System.out.println("light off");
        status = offStatus;
    }

}
