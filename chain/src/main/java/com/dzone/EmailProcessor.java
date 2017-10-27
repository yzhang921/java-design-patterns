package com.dzone;

import com.dzone.handler.EmailHandler;

/**
 * Created by zyong on 2017/10/27.
 */
public class EmailProcessor {
    //maintain a reference to the previous handler so we can add the next one
    private EmailHandler head;
    private EmailHandler last;

    public void addHandler(EmailHandler handler) {
        if (head == null) {
            head = handler;
        } else {
            last.setNext(handler);
        }
        last = handler;
    }

    public void handleRequest(Email email) {
        if (head != null) {
            head.handleRequest(email);
        }
    }
}
