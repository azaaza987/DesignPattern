package com.cyh.creational.prototype.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}