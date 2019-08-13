package com.athome.principle.singleresponsibility;

/**
 * @author 萧一旬
 * @date Create in 18:48 2019/8/12
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("自行车");
        vehicle.run("小车");
        vehicle.run("飞机");
    }
}

//  交通工具
//  方式1
//  1.在方式1的run方法中，违反了单一职责原则
//  2.解决的方案非常简单，根据交通工具运行方法不同，分解成不同类即可
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在路上跑..........");
    }
}
