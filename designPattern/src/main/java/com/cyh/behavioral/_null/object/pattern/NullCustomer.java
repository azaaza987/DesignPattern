package com.cyh.behavioral._null.object.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
