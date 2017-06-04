package com.wdm.design.strategy.mystery;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Troll say sth before fight");
        super.fight();
        System.out.println("Troll say sht after fight");
    }

}
