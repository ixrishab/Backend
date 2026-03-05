package org.example.Service;
import org.example.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private String name;
    private int age;
    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void registerUser(String name,int age , int rollno){
        System.out.println("Registering user...");
        userRepository.SaveUSer(name,age,rollno);
    }
}
