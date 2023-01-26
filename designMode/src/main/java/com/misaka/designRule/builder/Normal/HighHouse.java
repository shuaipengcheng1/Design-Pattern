package com.misaka.designRule.builder.Normal;

public class HighHouse implements BuilderBasic{
    public void buildWall(){
        System.out.println("砌墙");
    }
    public void roofed(){
        System.out.println("封顶");
    }
    public void buildBasic(){
        System.out.println("打桩");
    }
}
