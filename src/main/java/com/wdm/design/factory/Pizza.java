package com.wdm.design.factory;

public abstract class Pizza {

    private String name;
    private String dough;
    private String sauce;

    void prepare() {
        System.out.println("prepare: " + name);
        System.out.println("add dough: " + dough);
        System.out.println("add sauce: " + sauce);
    }


    public void bake() {
        System.out.println("bake: default");
    }

    public void cut() {
        System.out.println("cut: default");
    }

    public void box() {
        System.out.println("box: default");
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDough() {
        return dough;
    }


    public void setDough(String dough) {
        this.dough = dough;
    }


    public String getSauce() {
        return sauce;
    }


    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
}
