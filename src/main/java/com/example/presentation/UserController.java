package com.example.presentation;

import com.example.businesslayer.User;
import com.example.businesslayer.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        User userCreate = userService.save(new User(
                user.getId(), user.getUsername(),
                user.getFirstName(), user.getLastName()));

        return userCreate;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable long id) {
        return userService.findUserById(id);
    }
}