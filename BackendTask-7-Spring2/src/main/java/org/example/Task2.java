package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Task2 {
    @Autowired
    private GreetingService greetingService;
    public void execute(){
        greetingService.greet();
    }
}
