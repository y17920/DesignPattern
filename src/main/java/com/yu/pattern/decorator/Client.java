package com.yu.pattern.decorator;

public class Client {
    public static void main(String[] args) {
        FastFood food = new FriedRice();

        food = new Egg(food);
        System.out.println(food.cost());

        System.out.println(food.getDesc());
    }
}
