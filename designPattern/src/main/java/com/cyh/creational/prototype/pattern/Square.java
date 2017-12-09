package com.cyh.creational.prototype.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}