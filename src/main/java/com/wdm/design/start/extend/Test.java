package com.wdm.design.start.extend;

public class Test {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.show();
        duck = new RedheadDuck();
        duck.show();
        duck = new RubberDuck();
        duck.show();
        duck = new DecoyDuck();
        duck.show();
    }
}
