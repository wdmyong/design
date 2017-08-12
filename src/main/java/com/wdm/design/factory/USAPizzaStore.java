package com.wdm.design.factory;

public class USAPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type == "cheese") {
            return new USACheesePizza();
        }
        return new USADefaultPizza();
    }

}
