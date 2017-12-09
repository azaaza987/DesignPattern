package com.cyh.structural.bridge.pattern;

import org.junit.Test;

/**
 * Created by Administrator on 2017/12/9.
 */
public class BridgePatternDemo {

    @Test
    public void test() {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
