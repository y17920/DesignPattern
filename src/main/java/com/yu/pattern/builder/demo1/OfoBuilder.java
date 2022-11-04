package com.yu.pattern.builder.demo1;

public class OfoBuilder extends Builder{
    @Override
    public void buildSea() {
        bike.setSeat("ofo");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("ofo");
    }
}
