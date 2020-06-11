package com.ge.my.singleton;

 /**
  * 单例模式
  *
 * @author dengzhipeng
 * @version 1.0
 * @date 2020/6/11 0011
 */
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());

        System.out.println(Singleton.getInstance());
    }
}


class Singleton{

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        if (instance ==  null){
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
