package com.cyh.structural.adapter.pattern;

/**
 * Created by Administrator on 2017/12/11 0011.
 */
public class InterfaceAdapterTest {

    public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        source1.method1();
        source1.method2();

        Sourceable source2 = new SourceSub2();
        source2.method1();
        source2.method2();
    }
}
