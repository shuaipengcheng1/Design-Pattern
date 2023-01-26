package com.misaka.adapter;

public class ClassAdapter {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter());
    }
}

class Phone{
   // 组合

    public void charge(Voltage5v v){

        v.output5v();
    }
}


class Voltage220v{
    public int outPut220v(){
        return 220;
    }

}

interface Voltage5v{
    public int output5v();


}

class VoltageAdapter extends Voltage220v implements Voltage5v{

    @Override
    public int output5v() {
//        获取220v
      int src=  outPut220v();
//      转换
        src = 5;
//        返回
        System.out.println("输出5v");
        return src;
    }
}