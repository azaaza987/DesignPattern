package com.cyh.creational.factory.pattern.multiple.factory.method;

import com.cyh.creational.factory.pattern.normal.MailSender;
import com.cyh.creational.factory.pattern.normal.Sender;
import com.cyh.creational.factory.pattern.normal.SmsSender;

/**
 * Created by Administrator on 2017/12/10 0010.
 */
public class SendFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
