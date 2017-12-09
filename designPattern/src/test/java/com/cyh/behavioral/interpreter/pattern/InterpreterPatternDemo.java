package com.cyh.behavioral.interpreter.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class InterpreterPatternDemo {

    //规则：Robert 和 John 是男性
    public static OrExpression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static AndExpression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        OrExpression isMale = getMaleExpression();
        System.out.println("John is male? " + isMale.interpret("John"));

        AndExpression isMarriedWoman = getMarriedWomanExpression();
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
