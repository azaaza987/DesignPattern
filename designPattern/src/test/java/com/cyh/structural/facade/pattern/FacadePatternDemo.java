package com.cyh.structural.facade.pattern;

import org.junit.Test;

/**
 * Created by Administrator on 2017/12/9.
 */
public class FacadePatternDemo {

    @Test
    public void test() {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
