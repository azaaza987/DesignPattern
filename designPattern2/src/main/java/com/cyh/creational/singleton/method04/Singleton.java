package com.cyh.creational.singleton.method04;

/**
 * Created by Administrator on 2017/12/10 0010.
 *
 * 延迟加载，线程安全
 *
 * 静态内部类
 */
public class Singleton {

    private static final class SingletonFactory {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonFactory.INSTANCE;
    }


}
