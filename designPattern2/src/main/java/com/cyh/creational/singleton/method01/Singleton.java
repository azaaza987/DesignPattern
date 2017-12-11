package com.cyh.creational.singleton.method01;

/**
 * Created by Administrator on 2017/12/10 0010.
 *
 * 是延迟加载了，但非线程安全
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


}
