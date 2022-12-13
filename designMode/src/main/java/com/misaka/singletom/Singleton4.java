package com.misaka.singletom;

public class Singleton4 {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            SingletonTest4 singleTonTest2 = SingletonTest4.getInstance();
            System.out.println(singleTonTest2.hashCode());
        });
        Thread t2 = new Thread(() -> {
            SingletonTest4 singleTonTest2 = SingletonTest4.getInstance();
            System.out.println(singleTonTest2.hashCode());
        });
        t1.start();
        t2.start();
    }
}

class SingletonTest4{
//    懒汉式 线程安全
    private SingletonTest4(){};
    private static volatile   SingletonTest4 singleTonTest4;
//    加锁
    public  static synchronized   SingletonTest4 getInstance(){
        if(singleTonTest4 ==null){
            synchronized (SingletonTest4.class){
                if(singleTonTest4==null){
                    singleTonTest4 = new SingletonTest4();
                }
            }

        }

        return singleTonTest4;
    }

}
