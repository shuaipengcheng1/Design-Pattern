package com.misaka.designRule.builder.Improve;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        director.setHouseBuilder(commonHouseBuilder);
        director.builder();
        director.setHouseBuilder(new HighHouseBuilder());
        director.builder();
    }
}
