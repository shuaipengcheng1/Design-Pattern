package com.misaka.designRule.demeter;

public class DemeterImprove {
}
/*
 * 分析 A的直接朋友 :B[返回值] C[方法参数]
 * 迪米特法则就是 不要将自己的内部实现方法 写在别的类的内部
 * */
class A1 {
    public B1 reB(){
        return  new B1();
    }
    public void cTest(C1 c){
//        D1 d = new D1(); // 将D1代码封装到C1中
//        System.out.println(d.info);
        c.D1Info();
        System.out.println(c.info);
    }
}
class B1{

}
class C1{
    String info = "info";
    D1 d = new D1();
   public String D1Info(){
      return d.info;
   }
}
class D1{
    String info = "d1info";

}