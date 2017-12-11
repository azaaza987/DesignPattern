package com.cyh.behavioral.observer.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public interface Subject {

    void add(Observer observer);

    void del(Observer observer);

    void notifyObservers();

    void operation();
}