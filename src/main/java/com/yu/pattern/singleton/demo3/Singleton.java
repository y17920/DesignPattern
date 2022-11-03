package com.yu.pattern.singleton.demo3;

//懒汉式 线程不安全
public class Singleton {

    private Singleton() {
    }

    private static Singleton singleton;

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
