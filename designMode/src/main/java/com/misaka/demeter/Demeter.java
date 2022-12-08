package com.misaka.demeter;
//迪米特法则
public class Demeter {
}

/*
* 分析 A的直接朋友 :B[返回值] C[方法参数] 不是直接的朋友 : D[局部变量] 这样就违背了迪米特原则
* */
class A {
    public B reB(){
        return  new B();
    }
    public void cTest(C c){
        D d = new D();
        System.out.println(d.info);

        System.out.println(c.info);
    }
}
class B{

}
class C{
 String info = "info";
}
class D{
    String info = "d1info";

}