package com.cyh.behavioral.responsibility.chain.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FileDebugLogger: " + message);
    }
}
