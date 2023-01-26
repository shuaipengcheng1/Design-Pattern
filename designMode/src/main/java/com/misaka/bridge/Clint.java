package com.misaka.bridge;

public class Clint {
    public static void main(String[] args) {
        Phone xiaomi = new FoldedPhone(new XiaoMiBrand());
        xiaomi.brand.call();
    }
}
abstract class Phone{
    Brand brand;

}
class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand){
        this.brand = brand;
    }
}
class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand){
        this.brand = brand;
    }
}

interface Brand{
    void call();
}

class XiaoMiBrand implements Brand{
    @Override
    public void call() {
        System.out.println("小米");
    }
}
class HuaWei implements  Brand{
    @Override
    public void call() {
        System.out.println("华为");

    }
}
