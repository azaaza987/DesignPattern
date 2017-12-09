package com.cyh.structural.bridge.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
