package com.yu.pattern.singleton.demo5;

//懒汉式 双重检查
public class Singleton {

    private Singleton() {


    }

    private volatile static Singleton singleton;

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
