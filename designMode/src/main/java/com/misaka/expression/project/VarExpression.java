package com.misaka.expression.project;

import java.util.HashMap;

public class VarExpression implements Expression{
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
//        通过key来获取值
        return var.get(key);
    }
}
