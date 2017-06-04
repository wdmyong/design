package com.wdm.design.strategy.mystery;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Knight say sth before fight");
        super.fight();
        System.out.println("Knight say sht after fight");
    }

}
