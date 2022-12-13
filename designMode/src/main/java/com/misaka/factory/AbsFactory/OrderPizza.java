package com.misaka.factory.AbsFactory;

import java.util.Scanner;

public class OrderPizza {
//    聚合
    AbsFactory absFactory;

    public void setAbsFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;
    }

    public void order(){
        String t = getType();
//  通过抽象工厂组 来使用传入工厂实现类的order方法
        absFactory.order(t);
    }
    private String getType() {
        System.out.println("input type");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
