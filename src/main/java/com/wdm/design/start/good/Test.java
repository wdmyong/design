package com.wdm.design.start.good;

public class Test {

    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        duck.show();
        duck = new ModelDuck();
        duck.show();
        duck.setFlyBehavior(new FlyRocket());
        duck.setQuackBehavior(new Squeak());
        duck.show();
    }
}
