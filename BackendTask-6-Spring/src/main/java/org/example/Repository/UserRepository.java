package org.example.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void SaveUSer(String name,int age , int rollNo){
        System.out.println("Saving user...");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);

    }
}
