package com.praktikumDB.deploy.controller;

import com.praktikumDB.deploy.model.User;
import com.praktikumDB.deploy.service.UserService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Repository
@RequestMapping ("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String createUser(@RequestBody User request){
        userService.addUser(request);
        return "user created succesfully";
    }

}
