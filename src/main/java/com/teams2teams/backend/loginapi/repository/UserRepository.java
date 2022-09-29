package com.teams2teams.backend.loginapi.repository;

import com.teams2teams.backend.loginapi.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findByEmail(String email);
}




