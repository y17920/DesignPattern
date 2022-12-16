package com.yu.pattern.decorator;

public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood, 1.1f, "鸡蛋");
    }

    @Override
    public float cost() {
        return fastFood.getPrice() + getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
