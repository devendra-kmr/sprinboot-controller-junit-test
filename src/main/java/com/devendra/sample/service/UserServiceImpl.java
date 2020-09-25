package com.devendra.sample.service;

import com.devendra.sample.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUserList() {
        List<User> list= new ArrayList<>();
        User user = null;
        user= new User();
        user.setFirstName("AAAA");
        list.add(user);
        user= new User();
        user.setFirstName("BBBB");
        list.add(user);
        user= new User();
        user.setFirstName("CCCC");
        list.add(user);
        return list;
    }

    @Override
    public User createUser(User user) {
       User usr= new User();
        usr.setFirstName("AAAA");
        return usr;
    }
}
