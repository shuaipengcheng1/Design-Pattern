package com.misaka.observer.improve;

public class Sina extends Observer{

    @Override
    void display() {
        System.out.println("新浪");
        System.out.println("tem"+temperature);
        System.out.println("hum"+humidity);
        System.out.println("pre"+pressure);
    }
}
