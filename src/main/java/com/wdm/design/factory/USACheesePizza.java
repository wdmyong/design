package com.wdm.design.factory;

public class USACheesePizza extends Pizza {

    public USACheesePizza() {
        setName("USACheesePizza");
        setDough("USA dough");
        setSauce("USA sauce");
    }

    @Override
    public void cut() {
        System.out.println("cut for USA");
    }
}
