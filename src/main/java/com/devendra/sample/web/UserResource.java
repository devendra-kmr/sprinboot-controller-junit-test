package com.devendra.sample.web;


import com.devendra.sample.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class UserResource {

    @GetMapping("user/")
    public User getUserDetails(){
        User user = new User();
        user.setFirstName("Devendra");
        user.setLastName("Kumar");
        return user;
    }

}
