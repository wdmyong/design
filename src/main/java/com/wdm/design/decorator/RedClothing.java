package com.wdm.design.decorator;

public class RedClothing extends Clothing {

    public RedClothing(Person person) {
        super(person);
    }

    @Override
    public String show() {
        return super.show() + " with color red";
    }
}
