package com.misaka.singletom;


/*
* 饿汉式[静态变量]
* */
public class Singleton {
    public static void main(String[] args) {
        SingleTons singleTon = SingleTons.getInstance();
        SingleTons singleTon2 = SingleTons.getInstance();
        System.out.println(singleTon2.hashCode());
        System.out.println(singleTon.hashCode());

    }
}


class SingleTons{
//    防止new
    private   SingleTons(){}

//    在类的内部创建实例
    private static final SingleTons singleTon = new SingleTons();

//    对外提供一个静态方法
    public static SingleTons getInstance(){
        return  singleTon;
    }
}