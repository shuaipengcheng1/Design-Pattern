package com.misaka.compose.Test;

import java.util.ArrayList;
import java.util.List;

public class CLinet {
    public static void main(String[] args) {

        OrganizationComponent university = new University("NSU","11");
        OrganizationComponent computerColleage = new College("计算机","学院");
        OrganizationComponent department = new Department("软件","工程");
        OrganizationComponent department1 = new Department("网络","工程");
        computerColleage.add(department);
        computerColleage.add(department1);
        university.add(computerColleage);
university.print();
    }
}
