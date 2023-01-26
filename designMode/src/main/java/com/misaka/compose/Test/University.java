package com.misaka.compose.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class University extends OrganizationComponent{
//    管理的学院列表
List<OrganizationComponent> list =new ArrayList<>();


    public University(String name,String age) {
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
