package com.misaka.strategy;
/*
*
* 策略模式接口
* */
public interface FlyStrategy {
    void fly();
}

class GoodAtFly implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("飞的好");
    }
}
class BadAtFly implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("飞的差");

    }
}