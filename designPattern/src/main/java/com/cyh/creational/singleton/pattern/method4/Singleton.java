package com.cyh.creational.singleton.pattern.method4;

/**
 * Created by Administrator on 2017/12/9.
 *
 * 4、双检锁/双重校验锁（DCL，即 double-checked locking）
 *
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 *
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 */
public class Singleton {

    private volatile static Singleton singleton;

    private Singleton() {}

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
