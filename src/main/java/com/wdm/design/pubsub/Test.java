package com.wdm.design.pubsub;

public class Test {

    public static void main(String[] args) {
        Blog blog = new Blog();
        Observer observer = new Reader();
        blog.addObserver(observer);
        blog.addObserver(new Reader("0"));
        blog.addObserver(new Reader("1"));
        blog.addObserver(new Reader("2"));
        blog.addBlog("my first blog");
        blog.removeObserver(observer);
        blog.addBlog("my second blog");
        blog.delBlog(1);
    }
}
