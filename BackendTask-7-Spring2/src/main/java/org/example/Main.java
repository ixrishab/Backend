package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        Task2 task2 = context.getBean(Task2.class);
        task2.execute();
        Task3 task3 = context.getBean(Task3.class);
        task3.Display();
        Task4 task4 = context.getBean(Task4.class);
        task4.DisplayTask4();
    }
}