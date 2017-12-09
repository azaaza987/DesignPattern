package com.cyh.behavioral._null.object.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class NullPatternDemo {

    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        System.out.println(customer1.getName());
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        System.out.println(customer2.getName());
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        System.out.println(customer3.getName());
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");
        System.out.println(customer4.getName());
    }
}
