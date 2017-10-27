package com.dzone.handler;

import com.dzone.Email;

/**
 * Created by zyong on 2017/10/27.
 */
public abstract class EmailHandler {

    EmailHandler next;
    //reference to the next handler in the chain
    public abstract void setNext(EmailHandler handler);

    //handle requestpublic
    public void handleRequest(Email email) {
        if (next != null) {
            next.handleRequest(email);
        }
    };
}

