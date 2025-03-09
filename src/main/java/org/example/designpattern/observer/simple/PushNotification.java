package org.example.designpattern.observer.simple;

import java.util.ArrayList;
import java.util.List;

public class PushNotification implements Subject{

    List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    @Override
    public void pushMessage(Message message) {
        observers.stream().forEach(observer -> observer.observe(message));
    }
}
