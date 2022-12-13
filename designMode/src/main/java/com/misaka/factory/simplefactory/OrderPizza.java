package com.misaka.factory.simplefactory;

import java.util.Scanner;

public class OrderPizza {


    public OrderPizza(){
        Pizza pizza = null;
//        这里违反了 开放原则 导致新增一个类型 要修改代码
//        do {
//          String type =   getType();
//        if(type.equals("Greek")){
//            pizza = new GreekPizza("Greek");
//            pizza.prepare();
//
//            break;
//        }else if(type.equals("Chess")){
//            pizza = new ChessPizza("Chess");
//            pizza.prepare();
//            break;
//        }
//        }while (true);

//        使用简单工厂模式

        SimpleFactory.createPizza(getType());
    }

    public String getType(){
        System.out.println("input type");
        Scanner scanner  = new Scanner(System.in);
        return scanner.next();
    }
}
