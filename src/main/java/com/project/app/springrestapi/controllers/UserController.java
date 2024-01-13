package com.project.app.springrestapi.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.app.springrestapi.models.User;
import com.project.app.springrestapi.services.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
  @Autowired
  UserService userService;

  @GetMapping(value = { "", "/" })
  public ArrayList<User> getUsers() {
    return userService.getUsers();
  }

  @PostMapping(value = { "", "/" })
  public User saveUser(@RequestBody User user) {
    return userService.saveUser(user);
  }
}
