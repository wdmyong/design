package com.wdm.design.strategy.implement;

public interface Quackable {

    /*
     * jdk1.8之前java接口不具有实现代码
     * 所以继承接口无法达到代码的复用
     * jdk1.8可以提供default的实现代码
     */
    void quack();
}
