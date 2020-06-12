package com.ge.my.struct.adapter;

import org.junit.Test;

/**
 * 类适配器模式
 *
 * @author dengzhipeng
 * @version 1.0
 * @date 2020/6/12 0012
 */
public class ClassAdapterTest {

    /**
     * 类适配器客户端测试
     */
    @Test
    public void classAdapterTest() {
        Target target = new ClassAdapter();
        target.request();
    }

    /**
     * 对象适配器客户端测试
     */
    @Test
    public void objectAdapterTest() {
        ObjectAdapter adaptee = new ObjectAdapter(new Adaptee());
        adaptee.request();
    }
}

/**
 * 目标接口
 */
interface Target {

    /**
     * 客户端调用的接口
     */
    void request();
}

/**
 * 适配者接口
 */
class Adaptee {
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}

/**
 * 类适配器类, 说白了就是一种中转操作，
 */
class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}

/**
 * 对象适配器类
 */
class ObjectAdapter implements Target {
    /**
     * 适配者对象
     */
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
