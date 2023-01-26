package com.misaka.compose.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class College extends OrganizationComponent{
//    管理专业列表
    List<OrganizationComponent> list =new ArrayList<>();

    public College(String name,String age) {
        this.name =name;
        this.age = age;
    }

    @Override
    void print() {
        System.out.println("--------"+getName()+"---------");
        for (OrganizationComponent item :
                list             ) {
            item.print();
        }
    }

    void add(OrganizationComponent str){
        list.add(str);
    }
    void remove(OrganizationComponent str){
        list.remove(str);
    }
}
