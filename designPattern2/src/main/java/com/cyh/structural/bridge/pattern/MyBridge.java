package com.cyh.structural.bridge.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class MyBridge extends Bridge {

    @Override
    public void method() {
        getSource().method();
    }
}
