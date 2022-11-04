package com.yu.pattern.builder.demo1;

public class MobikeBuilder extends Builder{
    @Override
    public void buildSea() {
        bike.setSeat("摩拜单车");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("摩拜单车");
    }
}
