package com.cyh.creational._abstract.factory.pattern;

/**
 * Created by Administrator on 2017/12/10 0010.
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
