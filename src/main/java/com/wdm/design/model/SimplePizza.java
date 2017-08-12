package com.wdm.design.model;

public interface SimplePizza {

    default void outClassName() {
        System.out.println(this.getClass());
    }

    void prepare();

    void bake();

    void cut();

    void box();
}
