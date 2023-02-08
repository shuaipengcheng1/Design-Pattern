package com.misaka.strategy;

public abstract class Duck {
   abstract void showInfo();
//   聚合策略接口
   FlyStrategy flyStrategy;

//   构造方法 并且指定具体的策略

    public Duck(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void fly(){
        flyStrategy.fly();
    }


}
