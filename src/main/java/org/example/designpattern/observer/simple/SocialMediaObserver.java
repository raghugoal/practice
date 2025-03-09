package org.example.designpattern.observer.simple;

public class SocialMediaObserver implements Observer{
    private String identifier;
    public SocialMediaObserver(String identifier){
        this.identifier = identifier;
    }
    @Override
    public void observe(Message message) {
        System.out.println(identifier+" : "+message);
    }
}
