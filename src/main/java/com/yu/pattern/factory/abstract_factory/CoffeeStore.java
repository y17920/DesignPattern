package com.yu.pattern.factory.abstract_factory;

import com.yu.pattern.factory.factory_method.AmericanCoffeeFactory;
import com.yu.pattern.factory.factory_method.CoffeeFactory;

public class CoffeeStore {
    public static void main(String[] args) {
        DessertFactory factory = new AmericanDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
    }
}
