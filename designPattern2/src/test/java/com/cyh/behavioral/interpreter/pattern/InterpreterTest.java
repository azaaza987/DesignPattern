package com.cyh.behavioral.interpreter.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class InterpreterTest {

    public static void main(String[] args) {
        Context context = new Context(9, 2);
        int interpret = new Plus().interpret(context);
        Context context1 = new Context(interpret, 8);
        int result = new Minus().interpret(context1);
        System.out.println(result);
    }
}
