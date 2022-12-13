package com.misaka.factory.AbsFactory;

import com.misaka.factory.factoryfunc.BJChessPizza;
import com.misaka.factory.factoryfunc.BJPizza;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza create(String type) {
        if (type.equals("chess")) {
            return new BJChess();
        } else if (type.equals("normal")) {
            return new BJPerper();
        }
        return null;
    }
}
