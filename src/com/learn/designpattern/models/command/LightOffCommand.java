package com.learn.designpattern.models.command;

/**
 * Created by zhengxc on 2019/9/19.
 */
public class LightOffCommand implements Command{

    private Light light;

    private String preStatus;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        preStatus = light.getStatus();
        light.lightOff();
    }

    @Override
    public void unDo() {
        if(Light.onStatus.equals(preStatus)){
            light.lightOn();
        }else if(Light.offStatus.equals(preStatus)){
            light.lightOff();
        }
    }
}
