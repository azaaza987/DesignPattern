package com.cyh.behavioral.memento.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento newMementoFromState() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
