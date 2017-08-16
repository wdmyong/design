package com.wdm.design.command.Impl;

import com.wdm.design.command.Command;
import com.wdm.design.command.model.Fan;

/**
 * Created by wdmyong on 2017/8/12.
 */
public class FanRightCommand implements Command {

    private Fan fan;

    public FanRightCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnRight();
    }
}
