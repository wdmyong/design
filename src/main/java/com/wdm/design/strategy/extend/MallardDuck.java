package com.wdm.design.strategy.extend;

public class MallardDuck extends Duck {

    @Override
    public void diplay() {
        System.out.println(this.getClass().getName());
    }

}
