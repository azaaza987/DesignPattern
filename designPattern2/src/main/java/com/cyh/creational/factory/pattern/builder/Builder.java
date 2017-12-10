package com.cyh.creational.factory.pattern.builder;

import java.util.ArrayList;
import java.util.List;

import com.cyh.creational.factory.pattern.normal.MailSender;
import com.cyh.creational.factory.pattern.normal.Sender;
import com.cyh.creational.factory.pattern.normal.SmsSender;

/**
 * Created by Administrator on 2017/12/10 0010.
 */
public class Builder {

    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}
