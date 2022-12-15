package com.misaka.prototype.clonesheep;

public class Client {
    public static void main(String[] args) {
//        创建十只羊

//        传统方法
//        优点 好理解 简单好操作
//        缺点 在创建新的对象的时候 总是要获取原始对象的属性 如果创建的对象属性较多 效率会很低
//        总是需要重新初始化对象 而不是动态的获取对象运行时的状态 不够灵活
//        改进
//        Java的Object中有一个clone方法 该方法可以将一个Java对象复制一份 但是需要实现clone的Java类 必须要实现一个接口Cloneable 该接口标识该类有能够复制且具有复制的能力 ==> 原型模式
       Sheep sheep= new Sheep(10,"tom","白色");
        Sheep sheep1 = new Sheep(sheep.getAge(),sheep.getName(),sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getAge(),sheep.getName(),sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getAge(),sheep.getName(),sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getAge(),sheep.getName(),sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getAge(),sheep.getName(),sheep.getColor());
        Sheep sheep6 = new Sheep(sheep.getAge(),sheep.getName(),sheep.getColor());
        Sheep sheep7 = new Sheep(sheep.getAge(),sheep.getName(),sheep.getColor());
        Sheep sheep8 = new Sheep(sheep.getAge(),sheep.getName(),sheep.getColor());
        Sheep sheep9 = new Sheep(sheep.getAge(),sheep.getName(),sheep.getColor());



    }
}
