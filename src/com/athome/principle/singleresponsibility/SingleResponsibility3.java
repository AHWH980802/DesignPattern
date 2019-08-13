package com.athome.principle.singleresponsibility;

/**
 * @author 萧一旬
 * @date Create in 18:56 2019/8/12
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}

//方式3的分析
//1.这种修改方法没有对原来的类做大的修改，只是增加方法
//2.这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然遵守了单一职责原则
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在路上跑..........");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天上跑..........");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水上跑..........");
    }
}
