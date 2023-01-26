package com.misaka.designRule.builder.Improve;
//建造者模式的具体实现者
public class CommonHouseBuilder implements HouseBuilder {
    @Override
    public void buildWall() {
        System.out.println("普通房子 砌墙");
    }

    @Override
    public void buildBasic() {
        System.out.println("普通房子 砌墙");

    }

    @Override
    public void roofed() {
        System.out.println("普通房子 砌墙");

    }
}
