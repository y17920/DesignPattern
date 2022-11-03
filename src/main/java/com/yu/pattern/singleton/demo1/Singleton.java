package com.yu.pattern.singleton.demo1;

//饿汉式单例  静态变量
public class Singleton {
    private Singleton() {

    }

    private static Singleton singleton = new Singleton();

    public static Singleton getSingleton() {
        return singleton;
    }
}
