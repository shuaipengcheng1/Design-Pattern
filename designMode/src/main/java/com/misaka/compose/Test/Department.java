package com.misaka.compose.Test;

import java.util.Arrays;
import java.util.List;

public class Department extends OrganizationComponent{
    public Department(String name,String age) {
        this.name =name;
        this.age = age;
    }

    @Override
    void print() {
        System.out.println(getName());;
    }

    @Override
    void add(OrganizationComponent organizationComponent) {

    }
}
