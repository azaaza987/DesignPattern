package com.cyh.behavioral.observer.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

}
