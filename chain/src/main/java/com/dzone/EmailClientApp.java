package com.dzone;

import com.dzone.handler.BusinessMailHandler;
import com.dzone.handler.EmailHandler;
import com.dzone.handler.GMailHandler;

/**
 * Created by zyong on 2017/10/27.
 */
public class EmailClientApp {

    private EmailProcessor processor;

    public EmailClientApp() {
        createProcessor();
    }

    private void createProcessor() {
        processor = new EmailProcessor();
        processor.addHandler(new BusinessMailHandler());
        processor.addHandler(new GMailHandler());
    }

    public void addRule(EmailHandler handler) {
        processor.addHandler(handler);
    }

    public void emailReceived(Email email) {
        processor.handleRequest(email);
    }

    public static void main(String[] args) {
        EmailClientApp client = new EmailClientApp();
        client.emailReceived(new Email());
    }
}

