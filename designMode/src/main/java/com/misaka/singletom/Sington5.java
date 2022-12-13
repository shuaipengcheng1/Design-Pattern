package com.misaka.singletom;

public class Sington5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            SingletonTest5 singletonTest5 = SingletonTest5.getInstance();
            System.out.println(singletonTest5.hashCode());
        });
        Thread t2 = new Thread(()->{
            SingletonTest5 singletonTest5 = SingletonTest5.getInstance();
            System.out.println(singletonTest5.hashCode());

        });
        t1.start();
        t2.start();
    }
}

class SingletonTest5 {
    private SingletonTest5() {

    }

    //    静态內部类
    private static class SingleClass {
        //        当外部调用SingleClass.Instance 的时候 SingleClass才会装载 所以还实现了lazy loader
//        并且类的静态属性 只会在第一次加载类的时候就初始化 所以JVM帮助我们完成了线程安全 在类初始化的第三步分配线程锁和TLAB的时候
        public static SingletonTest5 Instance = new SingletonTest5();
    }

    public static SingletonTest5 getInstance() {
        return SingleClass.Instance;
    }
}
