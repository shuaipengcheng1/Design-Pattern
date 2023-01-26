package com.misaka.decortor;

public class Decortor extends  Drink{
    Drink drink;
    public Decortor(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDes() {
        return super.getDes()+drink.getDes();
    }

    @Override
    public float getPrice() {
//        调用父类的getPrice获取当前对象的price    的getPrice
        System.out.println("-----");
        return super.price+drink.getPrice();
    }

    @Override
    float cost() {
        return super.getPrice()+drink.getPrice();
    }
}
class Soy extends  Decortor{
    public Soy(Drink drink) {
        super(drink);
        this.price=1.0f;
        this.des="soy";
    }
}

class Soy2 extends  Decortor{
    public Soy2(Drink drink) {
        super(drink);
        this.price=2.0f;
        this.des="soy";
    }
}