package com.cyh.structural.decorator.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class RedShapeDecorator {

    private Shape decoratedShape;

    public RedShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void redShapeDraw() {
        decoratedShape.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Border Color: Red");
    }
}
