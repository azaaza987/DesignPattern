package com.cyh.structural.facade.pattern;

/**
 * Created by Administrator on 2017/12/11 0011.
 */
public class FacadeTest {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        System.out.println("===================");
        computer.shutdown();
    }
}
