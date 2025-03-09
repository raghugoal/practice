package org.example;

import org.example.designpattern.observer.simple.Message;
import org.example.designpattern.observer.simple.PushNotification;
import org.example.designpattern.observer.simple.SocialMediaObserver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello world!");
        PushNotification subjecter = new PushNotification();
        SocialMediaObserver instagram = new SocialMediaObserver("Instagram");
        SocialMediaObserver facebook = new SocialMediaObserver("Facebook");
        subjecter.addObserver(instagram);
        subjecter.addObserver(facebook);
        subjecter.pushMessage(new Message("First Testing"));
        Thread.sleep(2000);
        subjecter.pushMessage(new Message("testing observers"));
    }
}