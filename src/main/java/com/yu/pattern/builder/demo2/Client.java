package com.yu.pattern.builder.demo2;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer("amd", "16G", "gt610");
        System.out.println(computer.toString());


        Computer2 computer2 = new Computer2.Builder()
                .setCpu("121")
                .builder();
        System.out.println(computer2.toString());

    }
}
