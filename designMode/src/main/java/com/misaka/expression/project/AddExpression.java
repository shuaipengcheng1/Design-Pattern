package com.misaka.expression.project;

import java.util.HashMap;

public class AddExpression extends SymbolExpression{
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
//        到时候这里面实际调用的类就是 VarExpression的 interpreter方法
        return super.left.interpreter(var)+super.right.interpreter(var);
    }
}
