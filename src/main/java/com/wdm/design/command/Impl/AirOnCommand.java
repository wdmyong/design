package com.wdm.design.command.Impl;

import com.wdm.design.command.Command;
import com.wdm.design.command.model.Air;

/**
 * Created by wdmyong on 2017/8/12.
 */
public class AirOnCommand implements Command {

    private Air air;

    public AirOnCommand(Air air) {
        this.air = air;
    }

    @Override
    public void execute() {
        air.on();
    }
}
