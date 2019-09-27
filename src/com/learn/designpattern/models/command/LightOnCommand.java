package com.learn.designpattern.models.command;

/**
 * Created by zhengxc on 2019/9/19.
 */
public class LightOnCommand implements Command{

    private Light light;

    private String preStatus;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        preStatus = light.getStatus();
        light.lightOn();
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
