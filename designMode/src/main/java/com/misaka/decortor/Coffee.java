package com.misaka.decortor;

public abstract class Coffee extends Drink {

    @Override
    float cost() {
        return this.price;
    }
}

class EsCoffee extends  Coffee{
    public EsCoffee() {
        this.des = "意大利";
        this.price =6.0f;
    }
}

class SimpleCoffee extends  Coffee{
    public SimpleCoffee() {
        this.des = "普通";
        this.price =5.0f;
    }
}