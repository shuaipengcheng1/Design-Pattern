package com.misaka.designRule.builder.Normal;

public interface BuilderBasic {
   void buildWall();
   void roofed();
   void buildBasic();

//   让子类实现后 来调用这个方法
   default void build(){
       buildBasic();
       buildWall();
       roofed();
   }
}
