package com.cyh.behavioral.mediator.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class MediatorTest {

    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
