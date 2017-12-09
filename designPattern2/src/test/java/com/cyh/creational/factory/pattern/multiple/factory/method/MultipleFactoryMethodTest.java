package com.cyh.creational.factory.pattern.multiple.factory.method;

import org.junit.Test;

import com.cyh.creational.factory.pattern.normal.Sender;

/**
 * Created by Administrator on 2017/12/10 0010.
 */
public class MultipleFactoryMethodTest {

    @Test
    public void test1() {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }

    @Test
    public void test2() {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceSms();
        sender.Send();
    }
}
