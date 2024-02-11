package com.mydata.service;

import com.mydata.model.User;

public interface UserService {
    User saveUser(User user);
    
    public boolean isValidUser(User user);
}
