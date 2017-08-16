package com.wdm.design.command.Impl;

import com.wdm.design.command.Command;
import com.wdm.design.command.model.Fan;

/**
 * Created by wdmyong on 2017/8/12.
 */
public class FanLeftCommand implements Command {

    private Fan fan;

    public FanLeftCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnLeft();
    }
}
