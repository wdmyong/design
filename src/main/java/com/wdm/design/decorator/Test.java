package com.wdm.design.decorator;

public class Test {

    public static void main(String[] args) {
        Person p = new Man("SB");
        System.out.println(p.show());
        p = new RedClothing(p);
        System.out.println(p.show());
        p = new BlackShoes(p);
        System.out.println(p.show());

        p = new Woman("2B");
        System.out.println(p.show());
        p = new BlackShoes(p);
        System.out.println(p.show());
        p = new RedClothing(p);
        System.out.println(p.show());
    }
}
