package com.athome.principle.inversion.improve;

/**
 * @author 萧一旬
 * @date Create in 19:54 2019/8/14
 */
public class DependencyInversionDemo {

    public static void main(String[] args) {
        XiaoYiXun xiaoYiXun = new XiaoYiXun();
        //方式1
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(xiaoYiXun);

        //方式2
        OpenAndClose2 openAndClose2 = new OpenAndClose2(xiaoYiXun);
        openAndClose2.open();

        //方式3
        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTv(xiaoYiXun);
        openAndClose3.open();
    }
}

/**
 * 方式1：通过接口传递依赖
 * <p>
 * 开关的接口
 */
interface IOpenAndClose {
    /**
     * 抽象方法，接收接口
     *
     * @param tv
     */
    public void open(ITV tv);
}

/**
 * ITV接口
 */
interface ITV {
    public void play();
}

/**
 * 实现接口
 */
class OpenAndClose implements IOpenAndClose {

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}


/**
 * 方式2：通过构造方法传递依赖
 * <p>
 * 开关的接口
 */
interface IOpenAndClose2 {
    /**
     * 抽象方法，接收接口
     */
    public void open();
}

/**
 * ITV接口
 */
interface ITV2 {
    public void play();
}

/**
 * 实现接口
 */
class OpenAndClose2 implements IOpenAndClose2 {

    //成员
    private ITV2 itv2;

    /**
     * 通过构造器传递
     */
    public OpenAndClose2(ITV2 itv2) {
        this.itv2 = itv2;
    }

    @Override
    public void open() {
        itv2.play();
    }
}

/**
 * 方式3：通过setter方法传递依赖
 * <p>
 * 开关的接口
 */
interface IOpenAndClose3 {
    /**
     * 抽象方法，接收接口
     */
    public void open();

    public void setTv(ITV3 itv3);
}

/**
 * ITV接口
 */
interface ITV3 {
    public void play();
}

/**
 * 实现接口
 */
class OpenAndClose3 implements IOpenAndClose3 {

    //成员
    private ITV3 itv3;

    @Override
    public void open() {
        itv3.play();
    }

    @Override
    public void setTv(ITV3 itv3) {
        this.itv3 = itv3;
    }
}


class XiaoYiXun implements ITV, ITV2, ITV3 {

    @Override
    public void play() {
        System.out.println("电视机打开");
    }
}
