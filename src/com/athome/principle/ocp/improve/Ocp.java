package com.athome.principle.ocp.improve;

/**
 * @author 萧一旬
 * @date Create in 16:12 2019/8/17
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}


//这是一个用于绘图的类 [使用方]
class GraphicEditor {
   public void drawShape(Shape shape){
       shape.draw();

   }
}

//Shape 类，基类
abstract class Shape {

    public abstract void draw();
}


class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}


class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}


//新增画三角形
class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}
