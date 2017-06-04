package com.wdm.design.strategy.extend;

public class DecoyDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("I can't quack" + this.getClass().getName());
    }

    @Override
        public void fly() {
            System.out.println("I can't fly" + this.getClass().getName());
        }
    @Override
    public void diplay() {
        System.out.println(this.getClass().getName());
    }

}
