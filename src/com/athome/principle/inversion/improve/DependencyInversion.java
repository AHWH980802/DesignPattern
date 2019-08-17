package com.athome.principle.inversion.improve;

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

/**
 * 定义一个接口
 */
interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件信息：Hello World";
    }
}


/**
 * 方式2
 */
class Person {

    /**
     * 这里对接口依赖
     * @param i
     */
    public void receive(IReceiver i) {
        System.out.println(i.getInfo());
    }
}
