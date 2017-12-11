package com.cyh.behavioral.iterator.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public interface Iterator {

    Object previous();


    Object next();

    boolean hasNext();

    Object first();
}
