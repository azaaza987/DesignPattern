package com.cyh.creational._abstract.factory.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if ("RED".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("GREEN".equalsIgnoreCase(color)) {
            return new Green();
        } else if ("BLUE".equalsIgnoreCase(color)) {
            return new Blue();
        }
        return null;
    }
}
