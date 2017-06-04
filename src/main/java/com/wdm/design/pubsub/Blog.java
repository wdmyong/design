package com.wdm.design.pubsub;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject {

    private List<Observer> readerList;
    private List<String> blogList; 
    private Boolean isDel;

    public Blog() {
        readerList = new ArrayList<>();
        blogList = new ArrayList<>();
        isDel = false;
    }

    @Override
    public void addObserver(Observer observer) {
        readerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int pos = readerList.indexOf(observer);
        if (pos >= 0) {
            readerList.remove(pos);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : readerList) {
            if (isDel) {
                observer.update();
            } else {
                observer.update(blogList.get(blogList.size() - 1));
            }
        }
    }

    public void addBlog(String content) {
        blogList.add(content);
        isDel = false;
        notifyObservers();
    }

    public void delBlog(int i) {
        blogList.remove(i);
        isDel = true;
        notifyObservers();
    }
}
