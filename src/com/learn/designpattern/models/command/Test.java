package com.learn.designpattern.models.command;

/**
 * Created by zhengxc on 2019/9/19.
 */
public class Test {

    public static void main(String[] args) {
        Light light = new Light();
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        Tv tv = new Tv();
        TvOffCommand tvOffCommand = new TvOffCommand(tv);
        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommands(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommands(1, tvOnCommand, tvOffCommand);

        remoteControl.onCommand(0); //点灯打开
        remoteControl.offCommand(0);//点灯关闭
        remoteControl.unDo();//撤销
        remoteControl.onCommand(1);//tv打开
        remoteControl.offCommand(1);//tv关闭


    }

}
