package com.cyh.structural.proxy.pattern;

/**
 * Created by Administrator on 2017/12/9.
 *
 * 注意事项：
 *  1、和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。
 *  2、和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制。
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
