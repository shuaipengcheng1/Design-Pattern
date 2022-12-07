package com.misaka.segregation;

public class Segregation1 {
    public static void main(String[] args) {

    }
}
class A {
//    A类通过接口来使用[依赖]B 但是只会使用到 1 2 3
    public void depend1(inter1 inter){
        inter.opration1();
    }
    public void depend2(inter1 inter){
        inter.opration2();
    }
    public void depend3(inter1 inter){
        inter.opration3();
    }


}
class C {
    //    C类通过接口来使用[依赖]D 但是只会使用到 1 4 5
    public void depend1(inter1 inter){
        inter.opration1();
    }
    public void depend4(inter1 inter){
        inter.opration4();
    }
    public void depend5(inter1 inter){
        inter.opration5();
    }


}
//    但是这样发现 B类有五个方法 但是只需要使用3 个 D类也是如此
//按照依赖隔离原则 : 将接口拆分粒度 为几个独立的接口 类A 和 类C 分别使用对应的接口 这就是接口隔离

interface inter1{
    void opration1();
    void opration2();
    void opration3();
    void opration4();
    void opration5();

}
class B implements inter1{
    @Override
    public void opration1() {
        System.out.println("B 实现了 1  ");
    }

    @Override
    public void opration2() {
        System.out.println("B 实现了 2  ");

    }

    @Override
    public void opration3() {
        System.out.println("B 实现了 3  ");

    }

    @Override
    public void opration4() {
        System.out.println("B 实现了 4  ");

    }

    @Override
    public void opration5() {
        System.out.println("B 实现了 5  ");

    }
}

class D implements inter1{
    @Override
    public void opration1() {
        System.out.println("D 实现了 1  ");

    }

    @Override
    public void opration2() {
        System.out.println("D 实现了 2  ");

    }

    @Override
    public void opration3() {
        System.out.println("D 实现了 3  ");

    }

    @Override
    public void opration4() {
        System.out.println("D 实现了 4  ");

    }

    @Override
    public void opration5() {
        System.out.println("D 实现了 5  ");

    }
}