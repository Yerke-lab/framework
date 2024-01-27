package com.example.sem3HomeTask.services;

import com.example.sem3HomeTask.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {


    private UserService userService;

    public void processRegistration(User user) {
         userService.createUser(user);
    }
    public void processRegistration(String name,int age,String email) {
        userService.createUser(new User(name,age,email));
    }

}
