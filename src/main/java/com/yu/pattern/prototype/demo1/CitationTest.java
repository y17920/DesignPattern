package com.yu.pattern.prototype.demo1;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation("小明");
        Citation clone = citation.clone();
        clone.setName("小张");
        citation.show();
        clone.show();
    }
}
