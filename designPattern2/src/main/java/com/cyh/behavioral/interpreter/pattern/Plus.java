package com.cyh.behavioral.interpreter.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class Plus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
