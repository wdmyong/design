package com.wdm.design.decorator;

public abstract class Clothing extends PersonDecorator {

    private Person person;

    public Clothing(Person person) {
        this.person = person;
    }

    @Override
    public String show() {
        return person.show() + " clothing";
    }

}
