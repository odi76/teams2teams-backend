package com.teams2teams.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String jelszo;
    private String bemutatkozas;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jelszo='" + jelszo + '\'' +
                ", bemutatkozas='" + bemutatkozas + '\'' +
                '}';
    }



    public String getBemutatkozas() {
        return bemutatkozas;
    }

    public void setBemutatkozas(String bemutatkozas) {
        this.bemutatkozas = bemutatkozas;
    }

    public String getJelszo() {
        return jelszo;
    }

    public void setJelszo(String jelszo) {
        this.jelszo = jelszo;
    }


    protected  User(String jelszo) {
        this.jelszo = jelszo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(Long id, String name, String jelszo) {
        this.id = id;
        this.name = name;
        this.jelszo = jelszo;
    }
}
