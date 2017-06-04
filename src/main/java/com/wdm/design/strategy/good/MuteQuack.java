package com.wdm.design.strategy.good;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("mute quack");
    }

}
