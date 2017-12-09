package com.cyh.behavioral.visitor.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
