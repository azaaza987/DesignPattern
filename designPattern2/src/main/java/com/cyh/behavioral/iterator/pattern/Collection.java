package com.cyh.behavioral.iterator.pattern;



/**
 * Created by Administrator on 2017/12/11.
 */
public interface Collection {

    Iterator iterator();

    Object get(int i);

    int size();
}
