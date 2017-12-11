package com.cyh.structural.bridge.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class BridgeTest {

    public static void main(String[] args) {

        Bridge bridge = new MyBridge();

        Sourceable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();

        Sourceable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
