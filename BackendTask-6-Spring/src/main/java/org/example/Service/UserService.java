package org.example.Service;
import org.example.Repository.UserRepository;
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void registerUser(String name){
        System.out.println("Registering user...");
        userRepository.SaveUSer(name);
    }
}
