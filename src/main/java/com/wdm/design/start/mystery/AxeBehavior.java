package com.wdm.design.start.mystery;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println(this.getClass().getName() + "\tweapon");
    }

}
