package com.yu.pattern.decorator;

public class FriedRice extends FastFood{
    public FriedRice() {
        super(5.0f  , "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
