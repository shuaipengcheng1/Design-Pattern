package com.misaka.factory.factoryfunc;

import java.util.Scanner;

public abstract class PizzaOrder {
    abstract Pizza create(String type);

    public void order() {
        String type = getType();
        Pizza pizza = create(type); //这里虽然是一个抽象方法 但是由子类来调用就是实现后的方法 其实这里就是 this.create 当this为子类时 就是用的子类的create方法
        pizza.prepare();
    }

    private String getType() {
        System.out.println("input type");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
