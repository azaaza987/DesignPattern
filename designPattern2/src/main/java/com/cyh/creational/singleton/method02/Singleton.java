package com.cyh.creational.singleton.method02;

/**
 * Created by Administrator on 2017/12/10 0010.
 *
 * 延迟加载，线程安全
 *
 * 但是加了 synchronized 关键字，导致每次调用方法时，都需要同步
 * 而事实上，只有在第一次创建对象才需要真正的同步
 * 所以，性能有影响
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


}
