package com.wdm.design.pubsub;

public interface Observer {

    void update();

    void update(String content);
}
