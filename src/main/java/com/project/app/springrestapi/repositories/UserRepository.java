package com.project.app.springrestapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.app.springrestapi.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
