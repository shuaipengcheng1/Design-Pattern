package com.misaka.designRule.builder.Improve;

// 建造者模式的 抽象建造者
public interface HouseBuilder {
    House house=null;

//    使用其他的方法返回不同的房子
    void buildWall();
    void buildBasic();
    void roofed();

//    建造
    default House build(){
        buildBasic();
        buildWall();
        roofed();
        return house;
    }
}
