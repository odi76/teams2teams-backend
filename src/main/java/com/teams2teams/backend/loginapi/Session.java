package com.teams2teams.backend.loginapi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Session {

    @Id
    private String sessionId;
    private LocalDateTime createDate;

    //@Transient
    // MFL: szerintem nem a Transient kell, hanem a @ManyToOne, és ez ne opcionális legyen
    @ManyToOne(optional = false) 
    @JoinColumn(name = "userId")   //ezzel nem külső táblában lesznek az összerendelések
    private User user;

    protected Session() {}

    public Session(User user) {
        this.sessionId = UUID.randomUUID().toString();
        this.createDate = LocalDateTime.now();
        this.user = user;
    }
}
