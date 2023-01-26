package com.misaka.FlyWeight;

public class Client {
    String y = "";
    String t = "xx";
    public static void main(String[] args) {
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        flyWeightFactory.getFlyWeight("misaka").use(new User("misaka"));


        /*
        *
        * 复习多线程 wait notify
        *
        * */
//Client client = new Client();
//        Thread thread = new Thread(()->{
//            synchronized (client.t){
//                try {
//                    while (!client.y.equals("y")){
//                        client.t.wait(); // wait时会释放锁并且进入线程等待区 sleep只是重新加入运行栈 与其他线程竞争运行
//                    }
//                    System.out.println("wait");
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//
//        Thread thread2 = new Thread(()->{
//            try {
//                synchronized (client.t){
//                    System.out.println("2");
//                    Thread.sleep(1000);
//                    client.y = "y";
//                    client.t.notify();
//                    System.out.println("2");
//                }
//
//
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//        thread.start();
//        thread2.start();

    }
}
