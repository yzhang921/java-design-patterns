package com.dzone.handler;

import com.dzone.Email;

/**
 * Created by zyong on 2017/10/27.
 */
public class BusinessMailHandler extends EmailHandler {

    public void setNext(EmailHandler handler) {
        next = handler;
    }

    public void handleRequest(Email email) {
        System.out.println("BusinessMailHandler Process");
        if (email.getFrom().endsWith("@businessaddress.com")) {
            // process
        }
        super.handleRequest(email);
    }

}