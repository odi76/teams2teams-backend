package com.teams2teams.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.teams2teams.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    public List<User> findByEmail(String email);
    
}
