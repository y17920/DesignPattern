package com.yu.pattern.iterator;

import java.util.List;

public class Handler {

    List<Interceptor> list;
    int po = 0;

    public void setList(List<Interceptor> list) {
        this.list = list;
    }

    public String dohandle(){
        if (po >= list.size()){
            System.out.println("结束");
            return "结束";
        }
        Interceptor interceptor = list.get(po++);
        interceptor.intercept(this);
        return "";
    }

}
