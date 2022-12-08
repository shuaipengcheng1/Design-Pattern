package com.misaka.inversion;

public class DependecyInversion {
    public static void main(String[] args) {
        Person p = new Person();
        Email email = new Email();
        p.receive(email);
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息";
    }
}
class WX {
    public String getInfo() {
        return "电子邮件信息";
    }
}

//完成Person接受信息的功能
//这个写法有什么问题呢?
// 优点
// 1 简单 容易实现
// 缺点
// 1 如果我们获取的对象是 微信 短信 则这个方案就不能用了 只能新增类 Person类也只能重载方法

// 如何解决?
// 我们就可以使用一个接口 来抽象化 短信
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }

    public void receive(WX wx) {
        System.out.println(wx.getInfo());
    }

}