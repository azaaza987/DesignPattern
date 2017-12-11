package com.cyh.behavioral.command.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.exe();
    }
}
