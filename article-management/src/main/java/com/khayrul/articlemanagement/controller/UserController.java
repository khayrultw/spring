package com.khayrul.articlemanagement.controller;

import com.khayrul.articlemanagement.entity.User;
import com.khayrul.articlemanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping(value = "/user/signup", method = RequestMethod.POST)
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
