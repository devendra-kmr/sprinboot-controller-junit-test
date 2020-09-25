package com.devendra.sample.web;


import com.devendra.sample.domain.User;
import com.devendra.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/")
@RestController
public class UserResource {
    @Autowired
    private UserService userService;
    @GetMapping("user/")
    public List<User> getUserDetails(){
        return userService.getUserList();
    }


    @PostMapping("user/")
    public User getUserDetails(User user){
        return userService.createUser(user);
    }
}
