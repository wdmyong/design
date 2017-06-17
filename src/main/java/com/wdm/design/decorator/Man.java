package com.wdm.design.decorator;

public class Man extends Person {

    public Man(String name) {
        super(name);
    }

    @Override
    public String show() {
        return "man:\t" + getName();
    }

}
