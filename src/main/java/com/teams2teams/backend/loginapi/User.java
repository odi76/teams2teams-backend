package com.teams2teams.backend.loginapi;

import javax.persistence.*;
import java.util.List;

//TODO: db schema-t valahol vezetni kell
@Entity
@Table(name = "user")
public class User {

    //TODO: auto maradjon vagy sequence vagy más? Mitől függ?
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //TODO: jelölni kell, hogy unique
    @Column(name = "email", nullable = false, length = 200)
    private String email;

    //TODO: nem a jelszót tároljuk!, md5-öt a kliens állítja elő?, mezőnév maradjon?
    @Column(name = "password", nullable = false, length = 32)
    private String password;

    protected User() {}

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

}
