package com.wdm.design.strategy.good;

public class SickQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I am sink, just quack with low voice");
    }

}
