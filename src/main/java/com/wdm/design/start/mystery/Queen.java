package com.wdm.design.start.mystery;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Queen say sth before fight");
        super.fight();
        System.out.println("Queen say sht after fight");
    }

}
