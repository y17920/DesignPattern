package com.yu.pattern.prototype.demo2;


public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Student stu = new Student();
        stu.setName("小明");
        citation.setStu(stu);


        Citation clone = citation.clone();
        Student stu1 = clone.getStu();
        stu1.setName("小张");

        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));

        citation.show();
        clone.show();
    }
}
