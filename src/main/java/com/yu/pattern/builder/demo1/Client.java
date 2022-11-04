package com.yu.pattern.builder.demo1;

public class Client {
    public static void main(String[] args) {
        Builder builder = new MobikeBuilder();
        Director director = new Director(builder);
        Bike construct = director.construct();
        System.out.println(construct.getFrame());
        OfoBuilder ofoBuilder = new OfoBuilder();
        director = new Director(ofoBuilder);
        director.construct();
    }
}
