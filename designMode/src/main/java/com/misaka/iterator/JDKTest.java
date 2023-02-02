package com.misaka.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JDKTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("test");
        strings.add("test");
        strings.add("test");
        strings.add("test");
        // 获取迭代器
        Iterator iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }



    }

}
