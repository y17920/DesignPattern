package com.yu.pattern.singleton.demo2;

//饿汉式单例  静态代码块
public class Singleton {
    private Singleton() {

    }

    private static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
