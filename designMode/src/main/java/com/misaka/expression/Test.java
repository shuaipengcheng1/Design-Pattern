package com.misaka.expression;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
//            int a=arr[++i];
        }

        /*
        * a+b-c
        * index = 0 :a 调用defalut 压入栈
        * index = 1 :+ 调用add 先弹栈取出a 然后取出字符数组++i也就是B 然后放入addExpression中 并且压栈
        * index = 3 :- 调用Sub 弹栈取出addExpression 然后++i 取出C 然后放入SubExpression中 并且压栈
        * 这时 这个SubExpression 就包含了 left:addExpress right:c
        *
        *
        * */
    }
}
