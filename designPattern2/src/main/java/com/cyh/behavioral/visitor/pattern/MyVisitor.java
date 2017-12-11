package com.cyh.behavioral.visitor.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject: " + sub.getSubject());
    }
}
