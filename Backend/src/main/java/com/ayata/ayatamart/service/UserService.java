package com.ayata.ayatamart.service;

import com.ayata.ayatamart.controller.Status;
import com.ayata.ayatamart.dto.UserResponse;
import com.ayata.ayatamart.model.User;

public interface UserService {
    public UserResponse returnMethod(User user);
}
