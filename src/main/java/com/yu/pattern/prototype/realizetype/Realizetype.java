package com.yu.pattern.prototype.realizetype;

public class Realizetype implements Cloneable {
    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        return ((Realizetype) super.clone());
    }
}
