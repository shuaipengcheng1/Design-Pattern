package com.misaka.designRule.builder.Normal;


/*
*
* 缺点 这里将创建房子的方法 和 房子本身绑定在一起 这样耦合度很高
* */
public class CommonHouse implements BuilderBasic{
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
