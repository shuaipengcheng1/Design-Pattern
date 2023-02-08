package com.misaka.strategy.jdk;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
//        这个接口就是一个策略接口
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1>o2){ //升序
//                    return 1;
//
//                }else {
//                    return -1;
//                }
//            }
//        };

        Integer[] data = {1,5,2,3,7,23,1,23,44};
//        策略方法
        Arrays.sort(data,(o1,o2)->{
            if(o1>o2){ //升序
                    return 1;

                }else {
                    return -1;
                }
        });
        System.out.println(Arrays.toString(data)); //升序
    }
}
