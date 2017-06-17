package com.wdm.design.decorator;

public abstract class Person {

    private String name = "default";

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
         return name;
    }

    public abstract String show();
}
