package com.teams2teams.backend.loginapi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Session {

    @Id
    private String sessionId;
    private LocalDateTime createDate;

    @Transient
    private User user;

    protected Session() {}

    public Session(User user) {
        this.sessionId = UUID.randomUUID().toString();
        this.createDate = LocalDateTime.now();
        this.user = user;
    }
}
