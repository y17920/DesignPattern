package com.yu.pattern.factory.simple_factory;

public class SimpleCoffeeFactory {
    public Coffee getCoffee(String name) {
        Coffee coffee = null;
        if("AmericanCoffee".equals(name)) {
            coffee = new AmericanCoffee();
        } else if("LatteCoffee".equals(name)) {
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}
