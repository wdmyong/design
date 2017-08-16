package com.wdm.design.command.model;

import com.wdm.design.command.enums.FanStatus;

/**
 * Created by wdmyong on 2017/8/12.
 */
public class Fan implements Switch {

    private int id;
    private String name;
    private FanStatus status;

    public Fan(){}

    public Fan(int id, String name, FanStatus status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public void turnRight() {
        status = FanStatus.turnRight(status);
        showStatus();
    }

    public void turnLeft() {
        status = FanStatus.turnLeft(status);
        showStatus();
    }

    private void showStatus() {
        if (status == FanStatus.OFF) {
            Switch.super.off();
        } else {
            Switch.super.on();
        }
    }

    @Override
    public String toString() {
        return "Fan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
