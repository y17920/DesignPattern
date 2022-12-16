package com.yu.pattern.template;

import org.springframework.jdbc.core.JdbcTemplate;

public class Client {
    public static void main(String[] args) {
        AbstractClass aClass = new Cook包菜();
        aClass.cook();
    }
}
