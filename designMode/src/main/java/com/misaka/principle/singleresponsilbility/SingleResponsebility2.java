package com.misaka.principle.singleresponsilbility;

public class SingleResponsebility2 {
    public static void main(String[] args) {
        SkyVehicle skyVehicle = new SkyVehicle();
        RoadVehicle roadVehicle = new RoadVehicle();
        skyVehicle.run("飞机");
        roadVehicle.run("汽车");
//        这个类已经遵守了单一职责原则
//        但是花销很大
    }
}

class SkyVehicle {
    //    天上的
    public void run(String value) {
        System.out.println(value + "在天上跑");
    }
}

class RoadVehicle {
    //    地上的
    public void run(String value) {
        System.out.println(value + "在公路上跑");
    }
}