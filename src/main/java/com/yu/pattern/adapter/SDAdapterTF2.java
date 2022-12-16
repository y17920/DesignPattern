package com.yu.pattern.adapter;

public class SDAdapterTF2 implements SDCard {

    TFCard tfCard;

    public SDAdapterTF2(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSd() {
        return "适配器" + tfCard.readTf();
    }
}
