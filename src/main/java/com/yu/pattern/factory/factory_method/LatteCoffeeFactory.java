package com.yu.pattern.factory.factory_method;

public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee getCoffee() {
        return new LatteCoffee();
    }
}
