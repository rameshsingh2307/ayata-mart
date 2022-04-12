package com.ayata.ayatamart.service;

import com.ayata.ayatamart.authentication.RandomToken;
import com.ayata.ayatamart.controller.Status;
import com.ayata.ayatamart.dao.UserRepository;
import com.ayata.ayatamart.dto.UserResponse;
import com.ayata.ayatamart.model.User;
import com.ayata.ayatamart.timestamp.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.lang.String;

import static com.ayata.ayatamart.controller.Status.FAILURE;
import static com.ayata.ayatamart.controller.Status.SUCCESS;

@Service
public class UserServiceImpl implements UserService {
     RandomToken randomtoken=new RandomToken();
     DateTime datetime=new DateTime();

    @Autowired
    UserRepository userRepository;
    UserResponse userResponse = new UserResponse();
     public UserResponse returnMethod(User user){

         List<User> users = userRepository.findAll();
         for (User other : users) {
             if (other.equals(user)) {
                String random= randomtoken.generatedToken();
                 System.out.println(random);
                 long timestamp= datetime.timeStamp();
                 System.out.println(timestamp);
                 // userRepository.save(user);
                 userResponse.setStatus(SUCCESS);
                 userResponse.setToken(random);
               //  userResponse.setToken(200);
                 return userResponse;
             }
         }
         userResponse.setStatus(FAILURE);
         userResponse.setToken(null);
         return userResponse;
}
}
