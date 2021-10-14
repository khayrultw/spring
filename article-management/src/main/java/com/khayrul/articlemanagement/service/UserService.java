package com.khayrul.articlemanagement.service;

import com.khayrul.articlemanagement.entity.User;
import com.khayrul.articlemanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser(){
        return (List<User>) userRepository.findAll();
    }

    public User addUser(User user){
        System.out.println(user);
        return userRepository.save(user);
    }

    public User updateUser(User user){
        System.out.println(user);
        return userRepository.save(user);
    }

    public String deleteUser(User user){
        userRepository.delete(user);
        return "deleted";
    }

    public User getUser(Integer id) {
        return  userRepository.findUserById(id);
    }
}
