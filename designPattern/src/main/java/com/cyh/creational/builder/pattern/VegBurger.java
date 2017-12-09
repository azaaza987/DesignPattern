package com.cyh.creational.builder.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
