package com.cyh.behavioral.mediator.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class MyMediator implements Mediator {

    private User user1;
    private User user2;

    @Override
    public void createMediator() {
        user1 = new User1();
        user2 = new User2();
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
