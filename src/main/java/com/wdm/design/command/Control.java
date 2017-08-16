package com.wdm.design.command;

/**
 * Created by wdmyong on 2017/8/12.
 */
public class Control {

    private int size;
    private Command[] onCommands;
    private Command[] offCommands;

    public Control(int size) {
        this.size = size;
        onCommands = new Command[size];
        offCommands = new Command[size];
    }

    public int getSize() {
        return size;
    }

    public void setCommand(int pos, Command onCommand, Command offCommand) {
        onCommands[pos] = onCommand;
        offCommands[pos] = offCommand;
    }

    public void setOnCommand(int pos, Command command) {
        onCommands[pos] = command;
    }

    public void setOffCommand(int pos, Command command) {
        offCommands[pos] = command;
    }

    // Fan 相当于turnRight，还得考虑下如何处理
    public void pushOnCommand(int pos) {
        onCommands[pos].execute();
    }

    // Fan 相当于turnLeft，还得老婆下如何处理
    public void pushOffCommand(int pos) {
        offCommands[pos].execute();
    }
}
