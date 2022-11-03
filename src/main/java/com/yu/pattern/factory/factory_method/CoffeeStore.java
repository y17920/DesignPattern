package com.yu.pattern.factory.factory_method;

public class CoffeeStore {
    public static void main(String[] args) {
        CoffeeFactory factory = new AmericanCoffeeFactory();
        Coffee coffee = factory.getCoffee();
    }
}
