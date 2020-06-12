package com.ge.my.creation.prototype;

/**
 * @author dengzhipeng
 * @version 1.0
 * @date 2020/6/11 0011
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        System.out.println(prototype.hashCode());

        prototype = prototype.clone();
        System.out.println(prototype.hashCode());
    }
}


class Prototype implements Cloneable{

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        System.out.println("对象克隆");
        return (Prototype) super.clone();
    }
}
