package com.wdm.design.strategy.good;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        // do nothing
        System.out.println("I can't fly");
    }

}
