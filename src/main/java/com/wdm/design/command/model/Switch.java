package com.wdm.design.command.model;

/**
 * Created by duanyong on 2017/8/16.
 */
public interface Switch {

    default void on() {
        System.out.println("open for" + this.toString());
    }

    default void off() {
        System.out.println("close for" + this.toString());
    }
}
