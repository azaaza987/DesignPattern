package com.cyh.creational._abstract.factory.pattern;

/**
 * Created by Administrator on 2017/12/10 0010.
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
