package com.cyh.structural.proxy.pattern;

/**
 * Created by Administrator on 2017/12/11 0011.
 *
 * 感觉和装饰器模式很像呢，，，？？？
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void after() {
        System.out.println("after proxy!");
    }

    private void before() {
        System.out.println("before proxy!");
    }
}
