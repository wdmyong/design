package com.wdm.design.factory;

public class ChinaPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type == "cheese") {
            return new ChinaCheesePizza();
        }
        return new ChinaDefaultPizza();
    }

}
