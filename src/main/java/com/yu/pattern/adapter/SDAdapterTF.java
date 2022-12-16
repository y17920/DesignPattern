package com.yu.pattern.adapter;

public class SDAdapterTF extends TfCardImpl implements SDCard {

    @Override
    public String readSd() {
        return "适配器"+readTf();
    }

}
