package com.misaka.factory.AbsFactory;

public interface AbsFactory {
    Pizza create(String type);
     default void order(String type){
//         根据type获取具体的对象 这里的this为AbsFactory接口的实现类 所以create已经被实现了 这里是this.create(type)
      Pizza pizza= create(type);
      pizza.prepare();
     }
}
