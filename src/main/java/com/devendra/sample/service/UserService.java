package com.devendra.sample.service;

import com.devendra.sample.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();
    User createUser(User user);
}
