package com.cyh.creational.factory.pattern._abstract.factory;

/**
 * Created by Administrator on 2017/12/10 0010.
 */
public class SendSmsFactory implements Provider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}