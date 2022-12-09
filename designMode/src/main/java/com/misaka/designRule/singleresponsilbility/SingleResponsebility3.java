package com.misaka.designRule.singleresponsilbility;

public class SingleResponsebility3 {
    //    第三个方案
    public static void main(String[] args) {

        Vehicle2 v = new Vehicle2();
        v.run("汽车");
        v.runAir("飞机");

//        这里没有对类进行粒度的拆分

//     这里虽然没有实现类级的单一职责原则 但是实现了 方法级别的单一职责原则

    }
}

class Vehicle2 {
    public void run(String v) {
        System.out.println(v + "在地上跑");
    }
    public void runAir(String v) {
        System.out.println(v + "在天上跑");

    }
}
