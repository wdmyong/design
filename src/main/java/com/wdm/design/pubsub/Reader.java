package com.wdm.design.pubsub;

public class Reader implements Observer {

    private String name;

    public Reader() {
        this.name = "default";
    }

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("I am " + name);
    }

    @Override
    public void update(String content) {
        System.out.println("I am " + name + "\treceive msg:\t" + content);
    }

}
