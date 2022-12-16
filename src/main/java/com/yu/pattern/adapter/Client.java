package com.yu.pattern.adapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCardImpl sdCard = new SDCardImpl();
        System.out.println(computer.readSd(sdCard));


        String s = computer.readSd(new SDAdapterTF());
        System.out.println(s);
    }
}
