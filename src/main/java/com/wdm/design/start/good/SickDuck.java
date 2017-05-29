package com.wdm.design.start.good;

public class SickDuck extends Duck {

    public SickDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new SickQuack();
    }

    @Override
    public void display() {
        System.out.println(this.getClass().getName() + "\tdisplay");
    }

}
