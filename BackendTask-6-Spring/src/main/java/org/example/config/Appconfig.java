package org.example.config;
import org.example.Repository.UserRepository;
import org.example.Service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Appconfig {

    @Bean
    public UserRepository userRepository(){
        return new UserRepository();
    }

    @Bean
    public UserService userService(){
        return new UserService(userRepository());
    }

}
