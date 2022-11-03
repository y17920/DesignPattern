package com.yu.pattern.prototype.demo1;

public class Citation implements Cloneable {

    private String name;

    public Citation(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "获得三好生奖状");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
