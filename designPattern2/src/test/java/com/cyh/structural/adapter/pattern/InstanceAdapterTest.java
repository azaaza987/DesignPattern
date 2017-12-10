package com.cyh.structural.adapter.pattern;

/**
 * Created by Administrator on 2017/12/11 0011.
 */
public class InstanceAdapterTest {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}
