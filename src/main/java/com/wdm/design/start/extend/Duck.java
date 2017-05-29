package com.wdm.design.start.extend;

public abstract class Duck {

    public void quack() {
        System.out.println("quack");
    }

    public void swim() {
        System.out.println("swim");
    }

    /*
     * 有创造性的会飞的功能添加
     */
    public void fly() {
        System.out.println("I can fly");
    }

    abstract public void diplay();

    /*
     * 钩子方法，调用所有内部行为方法
     */
    public void show() {
        quack();
        swim();
        diplay();
        fly();
    }
}
