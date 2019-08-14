package com.athome.principle.inversion;

/**
 * @author 萧一旬
 * @date Create in 19:35 2019/8/14
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：Hello World";
    }
}


/**
 * 完成Person接收消息的功能
 * 方式1分析：
 * 1.简单，比较容易想到
 * 2.如果我们获取的对象是微信，短信等，则需要新增类，同时Person也要增加相应的接收方法
 * 3.解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口发生依赖
 *      因为Email，WeChat等属于接收的范畴，他们各自实现IReceiver接口，这样就符合了依赖倒转原则
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
