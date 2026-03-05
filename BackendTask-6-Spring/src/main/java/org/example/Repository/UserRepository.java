package org.example.Repository;
@Repository
public class UserRepository {
    public void SaveUSer(String name){
        System.out.println("User Saved " + name);
    }
}
