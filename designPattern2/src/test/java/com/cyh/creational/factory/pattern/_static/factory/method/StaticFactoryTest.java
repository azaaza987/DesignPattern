package com.cyh.creational.factory.pattern._static.factory.method;

import org.junit.Test;

import com.cyh.creational.factory.pattern.normal.Sender;

/**
 * Created by Administrator on 2017/12/10 0010.
 */
public class StaticFactoryTest {

    @Test
    public void test1() {
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }

    @Test
    public void test2() {
        Sender sender = SendFactory.produceSms();
        sender.Send();
    }

}
