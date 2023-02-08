package com.misaka.strategy;

public class Client {
    public static void main(String[] args) {
//       使用 Context 这个项目中管理策略接口的是Duck类
        Duck duck  = new PekingDuck(new GoodAtFly());
        Duck duck1  = new WildDuck(new BadAtFly());
        duck.fly();
        duck1.fly();

    }
}
