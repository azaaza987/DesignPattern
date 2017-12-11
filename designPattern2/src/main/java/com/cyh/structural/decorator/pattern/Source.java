package com.cyh.structural.decorator.pattern;

/**
 * Created by Administrator on 2017/12/11 0011.
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
