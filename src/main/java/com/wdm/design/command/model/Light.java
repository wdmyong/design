package com.wdm.design.command.model;

import com.wdm.design.command.enums.LightStatus;

/**
 * Created by wdmyong on 2017/8/12.
 */
public class Light implements Switch {

    private String name;
    private LightStatus status;

    public Light() {}

    public Light(String name, LightStatus status) {
        this.name = name;
        this.status = status;
    }

    public void on() {
        status = LightStatus.ON;
        Switch.super.on();
    }

    public void off() {
        status = LightStatus.OFF;
        Switch.super.off();
    }

    @Override
    public String toString() {
        return "Light{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
