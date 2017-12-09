package com.cyh.singleton;

/**
 * Created by Administrator on 2017/11/25 0025.
 */
public class Singleton {

    private Singleton() {}

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
