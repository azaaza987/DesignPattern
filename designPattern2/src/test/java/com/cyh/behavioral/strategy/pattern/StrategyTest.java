package com.cyh.behavioral.strategy.pattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class StrategyTest {

    public static void main(String[] args) {
        ICalculator cal = new Plus();
        String exp = "2+8";
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
