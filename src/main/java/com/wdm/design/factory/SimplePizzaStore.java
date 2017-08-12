package com.wdm.design.factory;

import com.wdm.design.model.SimplePizza;

public class SimplePizzaStore {

    public SimplePizza orderPizza(String type) {
        // 相比于自己产生pizza，将根据类型(变化)生产过程交给工厂，有变化的时候
        // 也不用更改自己的类，只改工厂中方法即可
        SimplePizza pizza = SimplePizzaFactory.genePizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
