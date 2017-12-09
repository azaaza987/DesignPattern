package com.cyh.behavioral.template.pattern;

/**
 * Created by Administrator on 2017/12/9.
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        System.out.println("========================");

        game = new Football();
        game.play();
    }
}
