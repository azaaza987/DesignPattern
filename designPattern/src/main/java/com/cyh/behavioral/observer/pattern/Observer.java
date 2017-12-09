package com.cyh.behavioral.observer.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
