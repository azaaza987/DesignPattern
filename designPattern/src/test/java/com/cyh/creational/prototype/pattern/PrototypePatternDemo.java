package com.cyh.creational.prototype.pattern;

import org.junit.Test;

/**
 * Created by Administrator on 2017/12/9.
 */
public class PrototypePatternDemo {

    @Test
    public void test() {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape3.getType());
    }
}
