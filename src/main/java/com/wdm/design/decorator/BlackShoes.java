package com.wdm.design.decorator;

public class BlackShoes extends Shoes {

    public BlackShoes(Person person) {
        super(person);
    }

    @Override
    public String show() {
        return super.show() + " with color black";
    }
}
