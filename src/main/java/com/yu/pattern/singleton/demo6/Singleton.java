package com.yu.pattern.singleton.demo6;
//懒汉式  静态内部类
public class Singleton {

    private Singleton() {

    }

    static class SingletonInstance {
        static Singleton singleton = new Singleton();
    }

    public Singleton getInstance() {
        return SingletonInstance.singleton;
    }
}
