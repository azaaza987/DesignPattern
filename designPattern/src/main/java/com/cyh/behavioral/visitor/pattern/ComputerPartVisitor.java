package com.cyh.behavioral.visitor.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
