package com.misaka.factory.factoryfunc;

public class LDPizzaFatory extends PizzaOrder{
    @Override
    Pizza create(String type) {

        if(type.equals("chess")){
            return new LDChessPizza();
        }else if(type.equals("normal")){
            return new LDPizza();
        }
        return null;
    }
}
