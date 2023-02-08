package com.misaka.strategy;

public class PekingDuck extends Duck{
    public PekingDuck(FlyStrategy flyStrategy) {
        super(flyStrategy);
    }

    @Override
    void showInfo() {
        System.out.println("北京鸭");
    }
}
