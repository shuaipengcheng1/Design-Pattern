package com.misaka.designRule.liskov;

public class LisKov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.fun1(11, 3));
        System.out.println(a.fun1(1, 8));
        System.out.println("------里氏替换--------");
//        将父类的使用 改为子类的使用 并且查看 结果是否一致
        /*
        *  A : 8 -7
        *  B : 14 9
        *  说明这个继承关系 已经违背了里氏替换原则
        *  解决方法 将原来的父类 和子类都继承一个更通俗的基类 将原有的继承关系去除 采用依赖 聚合 组合等关系 来代替
        * */
        B b = new B();
        System.out.println(b.fun1(11, 3));
        System.out.println(b.fun1(1, 8));
    }
}

//A类
class A {
    public int fun1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends A {
    @Override
    /*重写了父类方法*/
    public int fun1(int num1, int num2) {
        return num1 + num2;
    }

    public int fun2(int a, int b) {
        return fun1(a, b) + 9;
    }
}
