package com.misaka.singletom;

public class Singleton6 {
    public static void main(String[] args) {
       SingletonTest6 singletonTest6= SingletonTest6.INSTANCE;
        SingletonTest6 singletonTest7= SingletonTest6.INSTANCE;
        System.out.println(singletonTest6.hashCode());
        System.out.println(singletonTest7.hashCode());
singletonTest6.sayOk();
    }
}
//通过枚举实现 也可以解决线程安全和lazyLoader 并且还可以解决通过反序列化创建多个对象
enum SingletonTest6{
  INSTANCE;
  public void sayOk(){
      System.out.println("ok");
  }
}