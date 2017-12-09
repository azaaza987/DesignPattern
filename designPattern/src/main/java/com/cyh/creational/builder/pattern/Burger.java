package com.cyh.creational.builder.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
