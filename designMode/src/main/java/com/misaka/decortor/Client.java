package com.misaka.decortor;

public class Client {
    public static void main(String[] args) {
        Drink drink = new EsCoffee(); //装饰着模式 主体
//        使用装饰者来包裹主体
        drink = new Soy(drink);
//        System.out.println(drink.getPrice());
//        将上次的drink对象作为参数传入进去
        drink = new Soy(drink);
        System.out.println(drink.getPrice());
//        drink = new Soy(drink);
//        System.out.println(drink.getPrice());
        drink = new Soy2(drink);
        System.out.println(drink.getPrice());
        drink = new Soy2(drink);
        System.out.println(drink.getPrice());
    }
}
