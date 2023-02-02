package com.misaka.expression.project;

import java.util.HashMap;
import java.util.Stack;
/*
* 相当于Context
*
* */


/*
 * a+b-c
 * index = 0 :a 调用defalut 压入栈
 * index = 1 :+ 调用add 先弹栈取出a 然后取出字符数组++i也就是B 然后放入addExpression中 并且压栈
 * index = 3 :- 调用Sub 弹栈取出addExpression 然后++i 取出C 然后放入SubExpression中 并且压栈
 * 这时 这个栈的栈顶为SubExpression 就包含了 left:addExpress right:c
 *
 *
 * */
public class Calculator {
    private Stack<Expression> stack = new Stack<>();
    //    左右值
    private Expression left;
    private Expression right;

    private Expression result;


    //    接受表达式 并且解析 这里的str就是 a+b-c这种
    public Calculator(String str) {
     char[] chars=   str.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            switch (chars[i]){
                case '+':
//                    取左边的值
                    left = stack.pop();
//                    取右值 并且++i
                    right = new VarExpression(String.valueOf(chars[++i]));
//                    创建对应的解释器 并且压栈
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    //                    取左边的值
                    left = stack.pop();
//                    取右值 并且++i
                    right = new VarExpression(String.valueOf(chars[++i]));
//                    创建对应的解释器 并且压栈
                    stack.push(new SubExpression(left,right));
                    break;

                default:
//                    变量
                    stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        result = stack.pop();

    }
    public int run(HashMap<String,Integer> var){
//        执行
        return this.result.interpreter(var);
    }

}
