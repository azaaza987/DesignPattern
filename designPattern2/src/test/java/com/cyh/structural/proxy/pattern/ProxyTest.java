package com.cyh.structural.proxy.pattern;

/**
 * Created by Administrator on 2017/12/11 0011.
 */
public class ProxyTest {

    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}
