package com.cyh.behavioral.iterator.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class IteratorTest {

    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
