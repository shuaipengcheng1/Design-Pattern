package com.misaka.designRule.segregation;

public class Segregation2 {
    public static void main(String[] args) {

        A1 a = new A1();

        a.depend2(new B1()); //这里就是 A 类 通过接口的数据类型来使用B1的代码
        a.depend1(new B1());
    }
}





class A1 {

    public void depend1(inter2 inter){
        inter.opration1();
    }
    public void depend2(interAB inter){
        inter.opration2();
    }
    public void depend3(interAB inter){
        inter.opration3();
    }


}
class C1 {

    public void depend1(inter2 inter){
        inter.opration1();
    }
    public void depend4(interCD inter){
        inter.opration4();
    }
    public void depend5(interCD inter){
        inter.opration5();
    }


}

//按照依赖隔离原则 : 将接口拆分粒度 为几个独立的接口 类A 和 类C 分别使用对应的接口 这就是接口隔离
interface  inter2{
    void opration1();

}

interface interAB{
//    AB 123
    void opration2();
    void opration3();


}
interface  interCD{
//    CD 145
    void opration4();
    void opration5();
}
class B1 implements interAB,inter2{
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


}

class D1 implements  interCD,inter2{
    @Override
    public void opration1() {
        System.out.println("D 实现了 1  ");

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
