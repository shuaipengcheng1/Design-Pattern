package com.misaka.openclose;



/*
* 这里就满足了OCP原则的 扩展开放(提供方--> shape1以及shape1的子类) 修改关闭(使用方 -- editor)原则 这里如果想要新增一个图像 那么只需要 新增一个shape1的实现类 然后实现draw方法 就ok了
*
* */
public class OCPImprove {
    public static void main(String[] args) {
        Editor editor = new Editor();
//        函数接口
        editor.draw(()->System.out.println("话"));


        editor.draw(new Circle1());
        editor.draw(new Rectangle1());

    }
}
class Editor{
//    依赖接口
    public void draw(Shape1 shape1){
        shape1.draw();
    }
}
interface Shape1{
  public void draw();
}


class Circle1 implements Shape1{
    @Override
    public void draw() {
        System.out.println("园");
    }
}

class Rectangle1 implements Shape1{
    @Override
    public void draw() {
        System.out.println("矩形");

    }
}