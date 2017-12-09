package com.cyh.behavioral.memento.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
