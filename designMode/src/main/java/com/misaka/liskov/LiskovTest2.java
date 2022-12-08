package com.misaka.liskov;

public class LiskovTest2 {
}

//依赖

interface Bases{
    int fun1(int num1, int num2);
}
//A类
class A2 implements Bases{
//    重写方法
    public int fun1(int num1, int num2) {
        return num1 - num2;
    }
}

class B2  {
    // 通过依赖接口来使用A2类
    private Bases a1 ;
    public int fun1(int num1, int num2) {
        return num1 + num2;
    }
//通过构造函数依赖  依赖三种方法 接口传递 构造函数依赖 setter依赖
    public B2(Bases a1) {
        this.a1 = a1;
    }

    public int fun2(int a, int b) {
        return fun1(a, b) + 9;
    }
    /*组合*/
    public int fun3(int a,int b){
        return this.a1.fun1(a,b);
    }
}