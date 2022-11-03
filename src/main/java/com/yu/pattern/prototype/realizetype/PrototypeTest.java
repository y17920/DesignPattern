package com.yu.pattern.prototype.realizetype;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();
        System.out.println(clone == realizetype);
    }
}
