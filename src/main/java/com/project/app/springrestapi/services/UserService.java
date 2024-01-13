package com.project.app.springrestapi.services;

import java.util.ArrayList;
import java.util.Optional;

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

  public Optional<User> getUserById(Long id) {
    return userRepository.findById(id);
  }

  public ArrayList<User> getUserByEmail(String email) {
    return userRepository.findByEmail(email);
  }

  public User saveUser(User user) {
    return userRepository.save(user);
  }

  public boolean deleteUser(Long id) {
    try {
      userRepository.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
