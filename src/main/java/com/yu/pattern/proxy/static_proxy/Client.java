package com.yu.pattern.proxy.static_proxy;

public class Client {
    public static void main(String[] args) {
        SellTickets tickets = new ProxyPoint();
        tickets.sell();
    }
}
