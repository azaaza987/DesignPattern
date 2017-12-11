package com.cyh.structural.bridge.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public abstract class Bridge {
    private Sourceable source;

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }

    public void method() {
        source.method();
    }
}
