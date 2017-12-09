package com.cyh.structural.facade.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
