package com.misaka.singletom;

public class Singleton3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            SingleTonTest2 singleTonTest2 = SingleTonTest2.getInstance();
            System.out.println(singleTonTest2.hashCode()); //21312405
        });
        Thread t2 = new Thread(() -> {
            SingleTonTest2 singleTonTest2 = SingleTonTest2.getInstance();
            System.out.println(singleTonTest2.hashCode()); //21984340
        });
        t1.start();
        t2.start();
    }
}

class SingleTonTest2 {
    //    懒汉式 线程不安全
    private SingleTonTest2() {
    }

    private static SingleTonTest2 singleTonTest2;

    //    方法
    public static SingleTonTest2 getInstance() {
        if (singleTonTest2 == null) {
            //        这里有多线程问题 共享线程的变量 可能会导致创建多个单例对象
            singleTonTest2 = new SingleTonTest2();
        }
        return singleTonTest2;
    }
}

