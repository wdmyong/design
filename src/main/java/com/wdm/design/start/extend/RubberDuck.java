package com.wdm.design.start.extend;

public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println(this.getClass().getName() + "\tquack");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public void diplay() {
        System.out.println(this.getClass().getName());
    }

}
