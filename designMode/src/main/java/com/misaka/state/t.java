package com.misaka.state;

public class t {
    public static void main(String[] args) {
        Object o = new Object();
      a a = new a();
        Thread t1 = new Thread(()->{
            synchronized (o){
                while (!a.f){
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("c");
            }
        });
        Thread t2 = new Thread(()->{
            synchronized (o){
                try {
                    System.out.println("xxx");
                    Thread.sleep(3000);
                    a.f=true;
                    o.notify();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        System.out.println("xxxxx");
        t2.start();
    }
}

class a{
   boolean f = false;
}
