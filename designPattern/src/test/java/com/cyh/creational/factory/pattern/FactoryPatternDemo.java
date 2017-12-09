package com.cyh.creational.factory.pattern;

import org.junit.Test;

/**
 * Created by Administrator on 2017/12/9.
 */
public class FactoryPatternDemo {

    @Test
    public void test1() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }

    @Test
    public void test2() {
        Rectangle rect = (Rectangle) ShapeFactory2.getClass(Rectangle.class);
        rect.draw();
        Square square = (Square) ShapeFactory2.getClass(Square.class);
        square.draw();
    }
}
