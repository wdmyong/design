package com.wdm.design.decorator;

public class Woman extends Person{

    public Woman(String name) {
        super(name);
    }

    @Override
    public String show() {
        return "woman:\t" + getName();
    }
}
