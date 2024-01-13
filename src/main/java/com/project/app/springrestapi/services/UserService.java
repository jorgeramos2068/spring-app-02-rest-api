package com.project.app.springrestapi.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.app.springrestapi.models.User;
import com.project.app.springrestapi.repositories.UserRepository;

@Service
public class UserService {
  @Autowired
  UserRepository userRepository;

  public ArrayList<User> getUsers() {
    return (ArrayList<User>) userRepository.findAll();
  }

  public User saveUser(User user) {
    return userRepository.save(user);
  }
}
