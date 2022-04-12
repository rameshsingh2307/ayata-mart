package com.ayata.ayatamart.controller;
import com.ayata.ayatamart.authentication.RandomToken;
import com.ayata.ayatamart.dao.UserRepository;
import com.ayata.ayatamart.dto.UserResponse;
import com.ayata.ayatamart.model.User;
import com.ayata.ayatamart.service.UserService;
import com.ayata.ayatamart.timestamp.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping()
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/users/login")
    public ResponseEntity<UserResponse> loginUser(@Valid @RequestBody User user) {
        return new ResponseEntity<UserResponse>(userService.returnMethod(user), HttpStatus.ACCEPTED);
    }

}

