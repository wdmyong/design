package com.wdm.design.start.extend;

public class MallardDuck extends Duck {

    @Override
    public void diplay() {
        System.out.println(this.getClass().getName());
    }

}
