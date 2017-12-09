package com.cyh.behavioral.strategy.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
