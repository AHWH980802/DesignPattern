package com.athome.principle.segregation.improve;

/**
 * @author 萧一旬
 * @date Create in 19:18 2019/8/13
 */
public class Segregation {

    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B()); //A类通过接口去依赖B类
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D()); //C类通过接口去依赖D类
        c.depend2(new D());
        c.depend3(new D());
    }
}

//接口1
interface interface1 {
    void operation1();
}

//接口2
interface interface2 {

    void operation2();

    void operation3();
}

//接口3
interface interface3 {

    void operation4();

    void operation5();
}

class B implements interface1, interface2 {
    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
}

class D implements interface1, interface3 {
    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

class A {   //  A类通过接口Interface1，Interface2使用B类，但是只会使用到1,2,3方法

    public void depend1(interface1 i) {
        i.operation1();
    }

    public void depend2(interface2 i) {
        i.operation2();
    }

    public void depend3(interface2 i) {
        i.operation3();
    }
}

class C {   //  C类通过接口Interface1，Interface3使用D类，但是只会使用到1,4,5方法

    public void depend1(interface1 i) {
        i.operation1();
    }

    public void depend2(interface3 i) {
        i.operation4();
    }

    public void depend3(interface3 i) {
        i.operation5();
    }
}
