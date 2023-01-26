package com.misaka.command;
/*
 *
 * 接收者
 *
 * */
public class Tv {
    public void on(){
        System.out.println("开机");
    }
    public void off(){
        System.out.println("关机");
    }
    private Tv() {

    }
    //    单例模式 - 静态内部类
    static class L{
        static   Tv instance = new Tv();
    }

}
