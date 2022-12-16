package com.yu.pattern.decorator;

public class FriedNoodles extends FastFood {
    public FriedNoodles(float price, String desc) {
        super(6.2f, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }

}
