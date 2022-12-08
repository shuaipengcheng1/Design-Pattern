package com.misaka.inversion;

public class DependecyInversion2 {
    public static void main(String[] args) {
        Wx wx = new Wx();
        Email2 email2 = new Email2();
        DuanXin duanXin = new DuanXin();
        Person1 person1 = new Person1();
        person1.recive(wx);
        person1.recive(email2);
        person1.recive(duanXin);
    }
}

interface Information{
   String getInfo();
}

//微信
class Wx implements Information{
    @Override
    public String getInfo() {
        return "微信";
    }
}

class Email2 implements Information{
    @Override
    public String getInfo() {
        return "电子邮箱";
    }
}
class DuanXin implements Information{
    @Override
    public String getInfo() {
        return "短信";
    }
}

class Person1{
  public void recive(Information information){
      System.out.println(information.getInfo());
  }
}


