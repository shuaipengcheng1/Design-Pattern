package com.misaka.command;
/*
*
* 接收者
*
* */
public class Light {
    public void on(){
        System.out.println("开灯");
    }
    public void off(){
        System.out.println("关灯");
    }
    private Light() {

    }
//    单例模式 - 静态内部类
    static class L{
      static   Light instance = new Light();
}

}
