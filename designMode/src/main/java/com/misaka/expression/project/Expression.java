package com.misaka.expression.project;

import java.util.HashMap;
/*
* 相当于 AbstractExpression
* */
public interface Expression {
//    var 到时候就是传的 a=10 b=20 这种值
    public int interpreter(HashMap<String,Integer> var);
}
