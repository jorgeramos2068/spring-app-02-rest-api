package com.project.app.springrestapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

  @GetMapping("/{id}")
  public Optional<User> getUserById(@PathVariable("id") Long id) {
    return userService.getUserById(id);
  }

  @GetMapping("/search")
  public ArrayList<User> getUserByEmail(@RequestParam("email") String email) {
    return userService.getUserByEmail(email);
  }

  @PostMapping(value = { "", "/" })
  public User saveUser(@RequestBody User user) {
    return userService.saveUser(user);
  }

  @DeleteMapping("/{id}")
  public boolean deleteUser(@PathVariable("id") Long id) {
    return this.userService.deleteUser(id);
  }
}
