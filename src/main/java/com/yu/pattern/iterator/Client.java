package com.yu.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Handler handler = new Handler();
        List<Interceptor> list = new ArrayList<>();

        list.add(new Interceptor() {
            @Override
            public String intercept(Handler handler) {
                System.out.println("11");
                handler.dohandle();
                System.out.println("22");
                return "33";
            }

        });
        list.add(new Interceptor() {
            @Override
            public String intercept(Handler handler) {
                System.out.println("1111111111");
                handler.dohandle();
                System.out.println("2222222222");
                return "33";
            }
        });
        handler.setList(list);
        handler.dohandle();
    }
}
