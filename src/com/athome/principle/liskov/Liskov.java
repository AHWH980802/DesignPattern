package com.athome.principle.liskov;

/**
 * @author 萧一旬
 * @date Create in 18:49 2019/8/16
 */
public class Liskov {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.function1(11, 3));
        System.out.println("1 - 8 = " + a.function1(1, 8));

        System.out.println("------------------");
        B b = new B();
        //这里本意是求出11-3
        System.out.println("11 - 3 = " + b.function1(11, 3));
        //1-8
        System.out.println("1 - 8 = " + b.function1(1, 8));
        System.out.println("11 + 3 + 9 = " + b.function1(11, 3));
    }
}

class A {

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
class B extends A {

    //重写了A类的方法，可能是无意识的
    @Override
    public int function1(int num1, int num2) {
        return num1 + num2;
    }

    public int function2(int num1, int num2) {
        return function1(num1, num2) + 9;
    }
}
