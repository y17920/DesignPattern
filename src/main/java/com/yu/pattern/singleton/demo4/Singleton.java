package com.yu.pattern.singleton.demo4;

//懒汉式 同步方法 效率不高
public class Singleton {
    private Singleton() {

    }

    private static Singleton singleton;

    public synchronized static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
