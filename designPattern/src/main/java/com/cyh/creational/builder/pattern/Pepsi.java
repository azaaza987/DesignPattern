package com.cyh.creational.builder.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
