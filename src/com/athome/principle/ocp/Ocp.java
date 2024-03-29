package com.athome.principle.ocp;

/**
 * @author 萧一旬
 * @date Create in 16:12 2019/8/17
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawRectangle(new Rectangle());
        graphicEditor.drawCircle(new Circle());
        graphicEditor.drawTriangle(new Triangle());
    }
}


//这是一个用于绘图的类 [使用方]
class GraphicEditor {
    //接收 Shape 对象，然后根据 type，来绘制不同的图形
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) {
            drawTriangle(s);
        } ;
    }

    //绘制矩形
    public void drawRectangle(Shape r) {
        System.out.println(" 绘制矩形 ");
    }

    //绘制圆形
    public void drawCircle(Shape r) {
        System.out.println(" 绘制圆形 ");
    }

    //绘制三角形
    public void drawTriangle(Shape r) {
        System.out.println(" 绘制三角形 ");
    }
}

//Shape 类，基类
class Shape {
    int m_type;
}


class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}


class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}


//新增画三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}
