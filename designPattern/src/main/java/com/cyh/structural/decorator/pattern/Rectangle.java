package com.cyh.structural.decorator.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}