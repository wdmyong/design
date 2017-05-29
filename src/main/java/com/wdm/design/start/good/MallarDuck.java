package com.wdm.design.start.good;

public class MallarDuck extends Duck {

    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println(this.getClass().getName() + "\tdisplay");
    }
}
