package com.yu.pattern.decorator;

public abstract class FastFood {
    float price;
    String desc;

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public abstract float cost();

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
