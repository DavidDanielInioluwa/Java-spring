package com.example.cmp325.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.lang.NonNull;

@Entity
public class User {
    @Id
    public Long id;

    @NonNull
    private String fullName;

    @NonNull
    private String password;

    @NonNull
    private String email;


    // @OneToMany()
    // private List<course> courses;




    // Getter and Setter methods
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getFullName() {
        return fullName;
    }

    public void setFullName(@NonNull String fullName) {
        this.fullName = fullName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
