package com.cyh.behavioral.template.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class TemplateTest {

    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
