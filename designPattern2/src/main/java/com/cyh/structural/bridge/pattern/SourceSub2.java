package com.cyh.structural.bridge.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class SourceSub2 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }
}
