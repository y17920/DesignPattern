package com.yu.pattern.factory.simple_factory;

public class CoffeeStore {
    public static void main(String[] args) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.getCoffee("AmericanCoffee");
    }
}
