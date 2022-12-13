package com.misaka.factory.AbsFactory;

public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
//        抽象工厂模式 根据传入不同的接口工厂实现类来实现 生产不同的产品
        orderPizza.setAbsFactory(new BJFactory());
        orderPizza.order();
        orderPizza.setAbsFactory(new LDFactory());
        orderPizza.order();

    }
}
