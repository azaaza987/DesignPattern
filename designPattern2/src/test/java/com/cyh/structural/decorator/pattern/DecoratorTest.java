package com.cyh.structural.decorator.pattern;

/**
 * Created by Administrator on 2017/12/11 0011.
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
