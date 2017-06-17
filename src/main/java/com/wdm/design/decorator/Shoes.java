package com.wdm.design.decorator;

public abstract class Shoes extends PersonDecorator {

    private Person person;

    public Shoes(Person person) {
        super();
        this.person = person;
    }

    @Override
    public String show() {
        return person.show() + " shoes";
    }

}
