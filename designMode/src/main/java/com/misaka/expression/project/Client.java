package com.misaka.expression.project;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

/*
 * 需求 通过 a+b+c 完成 判断要输入那些比如a+b+c就是 a b c 三个变量 并且完成对应的计算
 *
 * */
public class Client {
    public static void main(String[] args) throws IOException {
//        获取字符串
        String str = getStr();
//        赋值
        HashMap<String,Integer> var = getValue(str);
//        计算器初始化
        Calculator calculator  = new Calculator(str);
        System.out.println("结果"+calculator.run(var));

    }

    public static String getStr() throws IOException {
        System.out.println("输入表达式");
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static HashMap<String, Integer> getValue(String str) {
        HashMap<String, Integer> value = new HashMap<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            //               判断是否为a-z字符
            if (chars[i] >= 97 && chars[i] <= 122) {
//                转换
                String s = String.valueOf(chars[i]);
//             提示输入
                System.out.print(s + "=?");
//                取值
                int scanner = new Scanner(System.in).nextInt();
//                赋值
                value.put(s, scanner);
            }
        }
        return value;
    }
}


