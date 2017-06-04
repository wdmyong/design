package com.wdm.design.strategy.implement;

public interface Flyable {

    /*
     * 每个实现了接口的fly都要实现
     * 而且如果飞行行为出现了统一的变化，全部要改
     */
    void fly();
}
