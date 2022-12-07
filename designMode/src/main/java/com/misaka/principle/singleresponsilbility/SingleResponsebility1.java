package com.misaka.principle.singleresponsilbility;

public class SingleResponsebility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("公交车");
        vehicle.run("汽车");
        vehicle.run("飞机"); // 这里就违背了单一职责原则 因为Ve对象 只负责在公路上跑的工具 但是飞机不是
                                  // 解决方案 根据职责来拆分对象

    }
}

//交通工具
class Vehicle {
    public void run(String value) {
        System.out.println(value + "在公路上跑");
    }
}
