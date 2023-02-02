package com.misaka.observer.improve;

public class Baidu extends Observer{
    @Override
    void display() {
        System.out.println("百度");
        System.out.println("tem"+temperature);
        System.out.println("hum"+humidity);
        System.out.println("pre"+pressure);

    }

}
