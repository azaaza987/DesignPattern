package com.cyh.behavioral.observer.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());
        sub.operation();
    }
}
