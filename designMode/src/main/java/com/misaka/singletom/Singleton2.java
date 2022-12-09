package com.misaka.singletom;


//*
//
// 静态代码块
// */
public class Singleton2 {
    public static void main(String[] args) {
        SingletonTest singletonTest = SingletonTest.getInstance();
        SingletonTest singletonTest2 = SingletonTest.getInstance();
        System.out.println(singletonTest2.hashCode());
        System.out.println(singletonTest.hashCode());

    }

}


class SingletonTest{
    private static SingletonTest single = null;
//    静态代码块 在类加载的时候会被执行 并且不会多次调用
    static {
     single = new SingletonTest();
    }

    private SingletonTest(){

    }

    public static SingletonTest getInstance(){
        return single;
    }
}