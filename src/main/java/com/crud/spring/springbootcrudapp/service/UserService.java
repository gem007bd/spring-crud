package com.crud.spring.springbootcrudapp.service;

import com.crud.spring.springbootcrudapp.entity.Product;
import com.crud.spring.springbootcrudapp.entity.User;
import com.crud.spring.springbootcrudapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public List<User> saveUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    public  List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "User Deleted :" + id;
    }

    public User updateUser(User user) {
        User exitingUser = userRepository.findById(user.getId()).orElse(null);
        exitingUser.setFirstName(user.getFirstName());
        exitingUser.setMiddleName(user.getMiddleName());
        exitingUser.setLastName(user.getLastName());
        exitingUser.setMobile(user.getMobile());
        exitingUser.setUserName(user.getUserName());
        exitingUser.setEmail(user.getEmail());
        exitingUser.setPasswordHash(user.getPasswordHash());
        exitingUser.setHost(user.getHost());
        exitingUser.setIntroduction(user.getIntroduction());
        exitingUser.setStatus(user.getStatus());
        exitingUser.setProfile(user.getProfile());
        return userRepository.save(exitingUser);
    }

}
