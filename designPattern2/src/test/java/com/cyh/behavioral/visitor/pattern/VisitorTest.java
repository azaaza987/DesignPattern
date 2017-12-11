package com.cyh.behavioral.visitor.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class VisitorTest {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        Visitor visitor = new MyVisitor();
        sub.accept(visitor);
    }
}
