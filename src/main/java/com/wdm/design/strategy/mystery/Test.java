package com.wdm.design.strategy.mystery;

public class Test {

    public static void main(String[] args) {
        Character character = new King();
        character.fight();
        character.setWeaponBehavior(new AxeBehavior());
        character.fight();
        character = new Queen();
        character.fight();
        character = new Knight();
        character.fight();
        character = new Troll();
        character.fight();
    }
}
