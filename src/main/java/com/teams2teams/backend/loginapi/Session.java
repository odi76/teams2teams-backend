package com.teams2teams.backend.loginapi;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "session")
public class Session {

    @Id
    @Column(name = "id", length = 16)
    private String id;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    protected Session() {}

    public Session(User user) {
        this.id = UUID.randomUUID().toString();
        this.createTime = LocalDateTime.now();
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public User getUser() {
        return user;
    }
}
