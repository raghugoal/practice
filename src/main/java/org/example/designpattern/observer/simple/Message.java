package org.example.designpattern.observer.simple;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
public class Message {
    private String message;
    @Override
    public String toString(){
        return "Message received -> "+message;
    }

}
