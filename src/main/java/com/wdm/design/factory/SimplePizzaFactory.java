package com.wdm.design.factory;

import com.wdm.design.model.SimplePizza;
import com.wdm.design.model.impl.SimpleCheesePizza;
import com.wdm.design.model.impl.SimpleGreekPizza;
import com.wdm.design.model.impl.SimplePepperoniPizza;

public class SimplePizzaFactory {

    public static SimplePizza genePizza(String type) {
        SimplePizza pizza = null;
        if (type == "cheese") {
            pizza = new SimpleCheesePizza();
        } else if (type == "greek") {
            pizza = new SimpleGreekPizza();
        } else if (type == "pepperoni") {
            pizza = new SimplePepperoniPizza();
        }
        return pizza;
    }
}
