package com.wdm.design.strategy.good;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack");
    }

}
