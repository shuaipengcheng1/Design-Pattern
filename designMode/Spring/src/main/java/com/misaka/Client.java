package com.misaka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//       根据id 获取该对象

        // 原型模式 两个创建的对象 实际上是深拷贝的结果 也就是clone方法 或者是反序列化
       Test test =(Test) applicationContext.getBean("01");
        Test test1 =(Test) applicationContext.getBean("01");
        System.out.println(test==test1); //false

//     但是如果吧bean标签的scope属性 改为single 单例模式 那么就是true

    }
}
