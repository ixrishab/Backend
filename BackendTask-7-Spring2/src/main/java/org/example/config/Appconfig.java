package org.example.config;

import org.example.Task3;
import org.example.Task4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
    @Bean
    public Task3 task3(){
        return new Task3();
    }
    @Bean
    public Task4 task4(){
        return new Task4();
    }
}
