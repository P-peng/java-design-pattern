package com.ge.my.creation.abstractFactory;

/**
 * @author dengzhipeng
 * @version 1.0
 * @date 2020/6/10 0010
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory huaWeiFactory = new HuaWeiFactory();
        huaWeiFactory.createPhone();
        huaWeiFactory.createCharger();
        huaWeiFactory.createHeadset();

        System.out.println("");
        //  --------------------  新加 小米 产品 --------------------
        AbstractFactory xiaoMiFactory = new XiaoMiFactory();
        xiaoMiFactory.createPhone();
        xiaoMiFactory.createCharger();
        xiaoMiFactory.createHeadset();
    }
}

/**
 * 手机 产品
 */
interface Phone {
    // 声明类所需继承的共同接口，
}

/**
 * 耳机 产品
 */
interface Headset{
    // 声明类所需继承的共同接口，
}

/**
 * 充电器 产品
 */
interface Charger{
    // 声明类所需继承的共同接口，
}

/**
 * 抽象工厂类
 */
interface AbstractFactory{
    /**
     * 创建手机
     *
     * @return
     */
    Phone createPhone();

    /**
     * 耳机 产品
     *
     * @return
     */
    Headset createHeadset();

    /**
     * 充电器 产品
     *
     * @return
     */
    Charger createCharger();
}

/**
 * 华为手机
 */
class HuaWeiPhone implements Phone{

    public HuaWeiPhone(){
        System.out.println("华为手机创建了");
    }

}

/**
 * 华为耳机
 */
class HuaWeiHeadset implements Headset{

    public HuaWeiHeadset(){
        System.out.println("华为耳机创建了");
    }

}

/**
 * 华为充电器
 */
class HuaWeiCharger implements Charger{

    public HuaWeiCharger(){
        System.out.println("华为充电器创建了");
    }
}

/**
 * 华为工厂
 */
class HuaWeiFactory implements AbstractFactory{

    public Phone createPhone() {
        return new HuaWeiPhone();
    }

    public Headset createHeadset() {
        return new HuaWeiHeadset();
    }

    public Charger createCharger() {
        return new HuaWeiCharger();
    }
}

/**
 *  --------------------  新加 小米族 产品 --------------------
 *  则需要添加 小米族 产品 和 小米工厂
 */

/**
 * 小米手机
 */
class XiaoMiPhone implements Phone{

    public XiaoMiPhone(){
        System.out.println("小米手机创建了");
    }

}

/**
 * 小米耳机
 */
class XiaoMiHeadset implements Headset{

    public XiaoMiHeadset(){
        System.out.println("小米耳机创建了");
    }

}

/**
 * 小米充电器
 */
class XiaoMiCharger implements Charger{

    public XiaoMiCharger(){
        System.out.println("小米充电器创建了");
    }
}

/**
 * 小米工厂
 */
class XiaoMiFactory implements AbstractFactory{

    public Phone createPhone() {
        return new XiaoMiPhone();
    }

    public Headset createHeadset() {
        return new XiaoMiHeadset();
    }

    public Charger createCharger() {
        return new XiaoMiCharger();
    }
}
