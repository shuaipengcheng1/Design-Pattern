package com.misaka.FlyWeight;

public class ConcreteFlyWeight extends FlyWeight{
    /*内部状态 享元对象之间共享*/
    private String type ;

    public ConcreteFlyWeight(String type) {
        this.type = type;
    }

    @Override
    /*这里的User就是外部状态 享元对象之间不能共享*/
    public void use(User user) {

        System.out.println("网站的类型"+type+"用户的名字"+user.username);
    }
}
