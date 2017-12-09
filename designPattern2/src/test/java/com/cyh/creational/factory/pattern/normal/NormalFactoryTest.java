package com.cyh.creational.factory.pattern.normal;

import org.junit.Test;

/**
 * Created by Administrator on 2017/12/10 0010.
 */
public class NormalFactoryTest {

    @Test
    public void test1() {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }

    @Test
    public void test2() {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("mail");
        sender.Send();
    }

}
