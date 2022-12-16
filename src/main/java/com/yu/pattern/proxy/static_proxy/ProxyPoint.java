package com.yu.pattern.proxy.static_proxy;

public class ProxyPoint implements SellTickets {

    TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("加5毛钱");
        trainStation.sell();
    }
}
