package com.cyh.behavioral.visitor.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
