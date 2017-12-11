package com.cyh.behavioral.responsibility.chain.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("dealing " + name + " ...");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
