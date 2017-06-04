package com.wdm.design.strategy.mystery;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println(this.getClass().getName() + "\tweapon");
    }

}
