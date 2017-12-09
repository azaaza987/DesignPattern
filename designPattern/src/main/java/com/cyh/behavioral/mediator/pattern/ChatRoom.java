package com.cyh.behavioral.mediator.pattern;

import java.util.Date;

/**
 * Created by Administrator on 2017/12/9.
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "]: " + message);
    }
}
