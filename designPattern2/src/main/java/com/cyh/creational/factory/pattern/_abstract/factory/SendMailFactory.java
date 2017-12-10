package com.cyh.creational.factory.pattern._abstract.factory;

/**
 * Created by Administrator on 2017/12/10 0010.
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
