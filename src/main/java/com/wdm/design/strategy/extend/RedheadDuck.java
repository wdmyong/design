package com.wdm.design.strategy.extend;

public class RedheadDuck extends Duck {

    @Override
    public void diplay() {
        System.out.println(this.getClass().getName());
    }

}
