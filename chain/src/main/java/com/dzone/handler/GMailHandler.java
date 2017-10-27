package com.dzone.handler;

import com.dzone.Email;

/**
 * Created by zyong on 2017/10/27.
 */
public class GMailHandler extends EmailHandler {

    private EmailHandler next;

    public void setNext(EmailHandler handler) {
        next = handler;
    }

    public void handleRequest(Email email) {
        System.out.println("GMailHandler Process");
        if (email.getFrom().endsWith("@gmail.com")) {
            // process
        }
        super.handleRequest(email);
    }
}
