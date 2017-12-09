package com.cyh.behavioral.responsibility.chain.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ConsoleInfoLogger: " + message);
    }
}
