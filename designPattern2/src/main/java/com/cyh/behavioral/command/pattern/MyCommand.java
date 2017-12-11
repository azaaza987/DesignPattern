package com.cyh.behavioral.command.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
