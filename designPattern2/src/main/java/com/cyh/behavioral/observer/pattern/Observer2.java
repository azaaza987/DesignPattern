package com.cyh.behavioral.observer.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }

}
