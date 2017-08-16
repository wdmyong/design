package com.wdm.design.command.Impl;

import com.wdm.design.command.Command;
import com.wdm.design.command.model.Tv;

/**
 * Created by wdmyong on 2017/8/12.
 */
public class TvOffCommand implements Command {

    private Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
