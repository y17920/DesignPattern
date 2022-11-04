package com.yu.pattern.builder.demo1;

public abstract class Builder {
    protected Bike bike = new Bike();


    public abstract void buildSea();

    public abstract void buildFrame();

    public Bike create() {
        return bike;
    }
}
