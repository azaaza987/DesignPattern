package com.cyh.creational.builder.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
