package com.cyh.creational.factory.pattern.builder;

/**
 * Created by Administrator on 2017/12/10 0010.
 */
public class BuilderTest {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }

}
