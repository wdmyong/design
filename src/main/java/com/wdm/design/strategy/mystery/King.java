package com.wdm.design.strategy.mystery;

public class King extends Character {

    public King() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("King say sth before fight");
        super.fight();
        System.out.println("King say sht after fight");
    }

}
