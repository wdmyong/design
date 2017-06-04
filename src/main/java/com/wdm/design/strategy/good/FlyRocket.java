package com.wdm.design.strategy.good;

public class FlyRocket implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am a rocket, fly very fast");
    }

}
