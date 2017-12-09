package com.cyh.behavioral._null.object.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
