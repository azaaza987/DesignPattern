package com.cyh.structural.proxy.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        ProxyImage image = new ProxyImage("test_10mb.jpg");

        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }
}
