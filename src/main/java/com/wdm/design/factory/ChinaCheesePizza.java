package com.wdm.design.factory;

public class ChinaCheesePizza extends Pizza {

    public ChinaCheesePizza() {
        setName("ChinaDefaultPizza");
        setDough("China dough");
        setSauce("China sauce");
    }

    @Override
    public void bake() {
        System.out.println("bake for china");
    }
}
