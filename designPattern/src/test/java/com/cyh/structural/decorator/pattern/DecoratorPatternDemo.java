package com.cyh.structural.decorator.pattern;

import org.junit.Test;

/**
 * Created by Administrator on 2017/12/9.
 */
public class DecoratorPatternDemo {

    @Test
    public void test() {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        System.out.println("\nCircle of red border");
        redCircle.redShapeDraw();

        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("\nRectangle of red border");
        redRectangle.redShapeDraw();
    }

}
