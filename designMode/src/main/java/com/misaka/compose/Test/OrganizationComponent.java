package com.misaka.compose.Test;

import java.util.ArrayList;
import java.util.List;

//抽象类
public  abstract class OrganizationComponent {
   abstract void print();
   String name;
   String age;
   String getName(){
      return name;
   }
   String getAge(){
      return age;
   }
   List<OrganizationComponent> list =new ArrayList<OrganizationComponent>();
   void add(OrganizationComponent organizationComponent){
      System.out.println(this);
      this.list.add(organizationComponent);
   }
}
