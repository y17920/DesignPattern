package com.yu.pattern.builder.demo1;

public class Director {

    private Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSea();
        return mBuilder.create();
    }
}
