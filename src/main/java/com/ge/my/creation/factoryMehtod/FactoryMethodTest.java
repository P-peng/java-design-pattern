package com.ge.my.creation.factoryMehtod;

/**
 * 工厂方法设计模式
 *
 * @author dengzhipeng
 * @version 1.0
 * @date 2020/6/10 0010
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        // 华为工厂创建华为产品
        Factory huaWeiFactory = new HuaWeiFactory();
        huaWeiFactory.createProduct();

        // 小米工厂创建小米产品
        Factory xiaoMiFactory = new XiaoMiFactory();
        xiaoMiFactory.createProduct();


        //  --------------------  新加 荣耀 产品 --------------------
        Factory rongYaoFactory = new RongYaoFactory();
        rongYaoFactory.createProduct();
    }
}


/**
 * 产品类，也可以是抽象类
 */
interface Product{
    //声明类所需继承的共同接口，
}

/**
 * 工厂类
 */
interface Factory{
    /**
     * 创建产品
     *
     * @return
     */
    Product createProduct();
}

/**
 * 华为产品
 */
class HuaWeiProduct implements Product{
    public HuaWeiProduct(){
        System.out.println("华为产品 创建");
    }
}

/**
 * 华为工厂类
 *
 */
class HuaWeiFactory implements Factory{
    /**
     * 华为 创建产品
     *
     * @return
     */
    public Product createProduct() {
        return new HuaWeiProduct();
    }
}

/**
 * 小米产品
 *
 */
class XiaoMiProduct implements Product{
    public XiaoMiProduct(){
        System.out.println("小米产品 创建");
    }
}

/**
 * 小米工厂类
 *
 */
class XiaoMiFactory implements Factory{
    /**
     * 小米 创建产品
     *
     * @return
     */
    public Product createProduct() {
        return new XiaoMiProduct();
    }
}

/**
 *  --------------------  新加 荣耀 产品 --------------------
 *  则需要添加 荣耀产品 和 荣耀工厂
 */

/**
 * 荣耀产品
 *
 */
class RongYaoProduct implements Product{
    public RongYaoProduct(){
        System.out.println("荣耀产品 创建");
    }
}

/**
 * 荣耀工厂类
 *
 */
class RongYaoFactory implements Factory{
    /**
     * 荣耀 创建产品
     *
     * @return
     */
    public Product createProduct() {
        return new RongYaoProduct();
    }
}



