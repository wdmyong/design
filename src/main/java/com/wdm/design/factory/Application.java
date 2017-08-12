package com.wdm.design.factory;

import com.wdm.design.model.SimplePizza;

public class Application {

    public static void main(String[] args) {
        SimplePizza pizza = SimplePizzaFactory.genePizza("greek");
        pizza.outClassName();

        PizzaStore store = null;

        // 中国默认门店下单
        store = new ChinaPizzaStore();
        store.orderPizza("default");
        // 中国cheese门店下单
        store.orderPizza("cheese");
        // USA默认门店下单
        store = new USAPizzaStore();
        store.orderPizza("other");
        // USAcheese门店下单
        store.orderPizza("cheese");
    }
}
