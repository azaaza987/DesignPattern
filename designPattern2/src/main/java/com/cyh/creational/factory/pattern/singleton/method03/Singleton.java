package com.cyh.creational.factory.pattern.singleton.method03;

/**
 * Created by Administrator on 2017/12/10 0010.
 *
 * 延迟加载，线程安全
 *
 * 双重校验锁
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}
