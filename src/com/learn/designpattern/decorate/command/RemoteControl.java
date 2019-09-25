package com.learn.designpattern.decorate.command;

/**
 * Created by zhengxc on 2019/9/19.
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command unDoCommand;

    public RemoteControl() {
        onCommands = new Command[2];
        offCommands = new Command[2];
        for (int i = 0; i < 2; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommands(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onCommand(int slot){
        onCommands[slot].execute();
        unDoCommand = onCommands[slot];
    }

    public void offCommand(int slot){
        offCommands[slot].execute();
        unDoCommand = offCommands[slot];
    }

    public void unDo(){
        unDoCommand.unDo();
    }




}
