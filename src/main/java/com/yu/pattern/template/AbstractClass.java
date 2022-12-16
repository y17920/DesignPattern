package com.yu.pattern.template;

public abstract class AbstractClass {

    private void 倒油() {
        System.out.println("倒油");
    }

    private void 热油() {
        System.out.println("热油");
    }

    public abstract void 倒蔬菜();

    private void 倒调料品() {
        System.out.println("倒调料品");
    }

    private void 翻炒() {
        System.out.println("翻炒");
    }

    public void cook() {
        倒油();
        热油();
        倒蔬菜();
        倒调料品();
        翻炒();
    }

}
