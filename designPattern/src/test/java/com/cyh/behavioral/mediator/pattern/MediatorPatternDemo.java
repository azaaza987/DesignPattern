package com.cyh.behavioral.mediator.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        robert.sendMessage("Hi! John!");

        User john = new User("John");
        john.sendMessage("Hello! Robert!");
    }
}
