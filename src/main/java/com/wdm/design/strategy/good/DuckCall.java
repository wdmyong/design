package com.wdm.design.strategy.good;

public class DuckCall {

    Duck duck;

    public DuckCall() {
        duck = new MallarDuck();
    }

    public DuckCall(Duck duck) {
        this.duck = duck;
    }

    public void setDuck(Duck duck) {
        this.duck = duck;
    }

    public void call() {
        duck.performQuack();
    }

    public static void main(String[] args) {
        // 默认模拟MallarDuck
        DuckCall duckCall = new DuckCall();
        duckCall.call();
        Duck duck = new SickDuck();
        // 动态改变模拟对象为病了的鸭子
        duckCall.setDuck(duck);
        // 病了的鸭子声音有点小
        duckCall.call();
        // 强行让生病的鸭子发出大声音
        duck.setQuackBehavior(new Squeak());
        duckCall.call();
    }
}
