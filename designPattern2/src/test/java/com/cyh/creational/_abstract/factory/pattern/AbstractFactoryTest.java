package com.cyh.creational._abstract.factory.pattern;

import org.junit.Test;

/**
 * Created by Administrator on 2017/12/10 0010.
 */
public class AbstractFactoryTest {

    @Test
    public void test1() {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }

    @Test
    public void test2() {
        Provider provider = new SendSmsFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
