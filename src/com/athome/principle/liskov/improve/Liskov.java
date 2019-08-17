package com.athome.principle.liskov.improve;

/**
 * @author 萧一旬
 * @date Create in 18:58 2019/8/16
 */
public class Liskov {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.function1(11, 3));
        System.out.println("1 - 8 = " + a.function1(1, 8));

        System.out.println("---------------");
        B b = new B();
        //因为不再继承，所以调用完成的功能明确
        System.out.println("11 + 3 = " + b.function1(11, 3));
        System.out.println("1 + 8 = " + b.function1(1, 8));
        System.out.println("11 + 3 + 9 = " + b.function2(11, 3));

        //使用组合仍然可以使用到A类的相关方法
        System.out.println("11 - 3 = " + b.function3(11, 3));
    }
}

class Base {
    //把更加基础的方法和成员写到Base类
}

class A extends Base {

    //返回两个数的差
    public int function1(int num1, int num2) {
        return num1 - num2;
    }
}

/**
 * B类继承A类
 * <p>
 * 增加了一个新功能：完成两个数相加，然后和9求和
 */
class B extends Base {

    //如果B需要使用A类的方法，使用组合关系
    private A a = new A();

    //我们仍然使用A的方法
    public int function3(int num1, int num2) {
        return this.a.function1(num1, num2);
    }

    public int function1(int num1, int num2) {
        return num1 + num2;
    }

    public int function2(int num1, int num2) {
        return function1(num1, num2) + 9;
    }
}
