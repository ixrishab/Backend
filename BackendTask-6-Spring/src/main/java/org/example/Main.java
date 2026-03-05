package org.example;
import org.example.config.Appconfig;
import org.example.Service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        UserService usersevice = context.getBean(UserService.class);
        usersevice.registerUser("Alice",20,101);
        BeanLifecycle cycle =context.getBean(BeanLifecycle.class) ;
        context.close();
    }
}