package com.cyh.behavioral.responsibility.chain.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public abstract class AbstractLogger {
    public static int DEBUG = 1;
    public static int INFO = 2;
    public static int ERROR = 3;

    protected int level;
    protected AbstractLogger nextLogger;

    abstract protected void write(String message);

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level >= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

}
