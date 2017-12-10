package com.cyh.structural.adapter.pattern;

/**
 * Created by Administrator on 2017/12/11 0011.
 */
public class ClassAdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }

}
