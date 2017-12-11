package com.cyh.behavioral.strategy.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class Multiply extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp, "\\*");
        return arrayInt[0] * arrayInt[1];
    }
}
