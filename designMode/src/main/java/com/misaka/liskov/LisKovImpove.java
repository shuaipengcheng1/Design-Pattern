package com.misaka.liskov;

public class LisKovImpove {
}


//创建一个基类
class Base{

}
//A类
class A1 extends Base{
    public int fun1(int num1, int num2) {
        return num1 - num2;
    }
}

class B1 extends Base {
  // 通过组合的方法来 替换以前的继承 这样可以提高耦合度
  private A1 a1 = new A1();
    public int fun1(int num1, int num2) {
        return num1 + num2;
    }

    public int fun2(int a, int b) {
        return fun1(a, b) + 9;
    }
    /*组合*/
    public int fun3(int a,int b){
        return this.a1.fun1(a,b);
    }
}

