package com.misaka.strategy;

public class WildDuck extends Duck{
    public WildDuck(FlyStrategy flyStrategy) {
        super(flyStrategy);
    }

    @Override
    void showInfo() {
        System.out.println("北京鸭");
    }
}
