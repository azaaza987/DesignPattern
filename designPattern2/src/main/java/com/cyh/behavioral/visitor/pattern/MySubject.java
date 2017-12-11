package com.cyh.behavioral.visitor.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
