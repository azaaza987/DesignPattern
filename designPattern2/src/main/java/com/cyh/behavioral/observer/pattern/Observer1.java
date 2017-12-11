package com.cyh.behavioral.observer.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
