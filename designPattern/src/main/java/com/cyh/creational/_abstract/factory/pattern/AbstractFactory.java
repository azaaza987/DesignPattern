package com.cyh.creational._abstract.factory.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
