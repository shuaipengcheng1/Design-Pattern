package com.misaka.factory.simplefactory;

public class SimpleFactory {
    public static Pizza createPizza(String type){
        Pizza pizza = null;
//        使用简单工厂模式
        if(type.equals("Greek")){
            pizza = new GreekPizza("Greek");
            pizza.prepare();


        }else if(type.equals("Chess")){
            pizza = new ChessPizza("Chess");
            pizza.prepare();

        }
        return pizza;

    }

}

//披萨接口
abstract class Pizza {
    private String name;
//不同的披萨有不同的准备流程 所以将其设为抽象方法
    abstract void prepare();

    void bake() {
        System.out.println(name + "baking");
    }

    ;

    void cut() {
        System.out.println(name + "cutting");

    }

    ;

    void box() {
        System.out.println(name + "boxing");

    }

    ;

    void setName(String name) {
        this.name = name;
    }

}

class ChessPizza extends Pizza {
    public  ChessPizza(String name){
        this.setName(name);
    }
    @Override
    public void prepare() {
        System.out.println("制作奶酪披萨");
    }


}

class GreekPizza extends Pizza {
    public  GreekPizza(String name){
        this.setName(name);
    }
    @Override
    public void prepare() {
        System.out.println("制作埃及披萨");

    }


}