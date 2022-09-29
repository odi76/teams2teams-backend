package com.teams2teams.backend.loginapi.repository;

import com.teams2teams.backend.loginapi.entity.Session;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends CrudRepository<Session, String> {
}
