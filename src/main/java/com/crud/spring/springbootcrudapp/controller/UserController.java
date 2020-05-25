package com.crud.spring.springbootcrudapp.controller;

import com.crud.spring.springbootcrudapp.entity.Product;
import com.crud.spring.springbootcrudapp.entity.User;
import com.crud.spring.springbootcrudapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users) {
        return userService.saveUsers(users);
    }

    @GetMapping("/users")
    public List<User> findAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("userById/{id}")
    public User findUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }


    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id) {
        return userService.deleteUser(id);
    }

}
