package com.misaka.designRule.builder.Improve;
// 建造者模式中的指挥者
public class Director {
    private HouseBuilder houseBuilder ;

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

//    建造
    public House builder(){
   return houseBuilder.build();
    }
}
