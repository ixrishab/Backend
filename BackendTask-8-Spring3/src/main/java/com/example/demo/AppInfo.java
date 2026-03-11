package com.example.demo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class AppInfo {
    @Value("${app.name}")
    private  String appName;
    @Value("${app.welcomeMessage}")
    private String welcomeMessage;

    @PostConstruct
    public void printInfo(){
        System.out.println("Application Name: " + appName);
        System.out.println("Message: " + welcomeMessage);
    }
}
