package com.cyh.behavioral.command.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class CommandTest {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
