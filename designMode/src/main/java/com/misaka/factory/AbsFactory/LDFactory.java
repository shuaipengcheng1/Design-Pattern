package com.misaka.factory.AbsFactory;

public class LDFactory implements AbsFactory{
    @Override
    public Pizza create(String type) {
        if (type.equals("chess")) {
            return new LDChess();
        } else if (type.equals("normal")) {
            return new LDPerper();
        }
        return null;
    }
}
