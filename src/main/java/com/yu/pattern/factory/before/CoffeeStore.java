package com.yu.pattern.factory.before;

public class CoffeeStore {

    public Coffee getCoffee(String name) {
        if ("AmericanCoffee".equals(name)) {
            return new AmericanCoffee();
        } else if ("LatteCoffee".equals(name)) {
            return new LatteCoffee();
        }
        throw new RuntimeException("不支持");
    }
}
