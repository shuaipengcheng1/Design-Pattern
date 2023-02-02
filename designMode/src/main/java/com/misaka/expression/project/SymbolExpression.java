package com.misaka.expression.project;

import java.util.HashMap;

public class SymbolExpression implements Expression{
//    左值 右值
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /*
    *
    * 这个实现方法 留给子类实现
    * */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
