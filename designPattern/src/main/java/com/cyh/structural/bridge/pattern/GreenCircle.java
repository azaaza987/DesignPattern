package com.cyh.structural.bridge.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
