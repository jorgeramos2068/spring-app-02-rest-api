package com.project.app.springrestapi.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.app.springrestapi.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  public abstract ArrayList<User> findByEmail(String email);
}
