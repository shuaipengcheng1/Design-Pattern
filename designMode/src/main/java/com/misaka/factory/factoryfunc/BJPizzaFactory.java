package com.misaka.factory.factoryfunc;

public class BJPizzaFactory extends PizzaOrder{
    @Override
    Pizza create(String type) {

        if (type.equals("chess")) {
            return new BJChessPizza();
        } else if (type.equals("normal")) {
            return new BJPizza();
        }
        return null;
    }
}
