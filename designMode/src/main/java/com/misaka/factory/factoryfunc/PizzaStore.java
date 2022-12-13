package com.misaka.factory.factoryfunc;

public class PizzaStore {
    public static void main(String[] args) {
//        创建一个BJ
        BJPizzaFactory bjPizzaFactory = new BJPizzaFactory();
        bjPizzaFactory.order();
//        创建一个ld
        LDPizzaFatory ldPizzaFatory  =new LDPizzaFatory();
        ldPizzaFatory.order();
    }
}
