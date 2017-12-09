package com.cyh.creational.prototype.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
