package com.misaka.facade;

public class Client {
    public static void main(String[] args) {
//        使用外观类 懒汉式无多线程问题
        Facade facade = new Facade();
//        facade.on();
        Thread thread =new Thread(facade::on);
        thread.start();
        Thread thread1 =new Thread(facade::on);
        thread1.start();
        Thread thread2 =new Thread(facade::on);
        thread2.start();
        Thread thread3 =new Thread(facade::on);
        thread3.start();
        Thread thread4 =new Thread(facade::on);
        thread4.start();
        Thread thread5 =new Thread(facade::on);
        thread5.start();

    }
}
