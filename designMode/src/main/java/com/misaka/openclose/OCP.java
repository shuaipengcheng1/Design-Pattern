package com.misaka.openclose;



/*
*  优缺点
* 1 比较简单 好理解 易操作
* 2 缺点是 违反了设计模式的开闭原则 即对扩展开放(提供方__>Shape) 对修改关闭(使用方__>GraphicEditor) 即当我们给类增加新功能时 尽量不要修改代码 或者少修改代码
* 3 比如如果我们需要新增一个图像的话 就必须先新增一个Shape子类 而且GraphicEditor 中的判断 和方法都要多写一个
* */
public class OCP {
    public static void main(String[] args) {
//        看问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
    }
}

class Shape {
    int m_type;
}

//这时用于绘图的类
class GraphicEditor {
    public void drawShape(Shape shape) {
        if (shape.m_type == 1) {
            drawCircle(shape);
        } else {
            drawRectangle(shape);
        }
    }

    public void drawCircle(Shape shape) {
        System.out.println("园");
    }

    public void drawRectangle(Shape shape) {
        System.out.println("矩形");
    }
}

class Circle extends Shape {
    public Circle() {
        super.m_type = 1;
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 2;
    }
}
