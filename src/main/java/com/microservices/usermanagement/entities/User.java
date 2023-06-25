package com.microservices.usermanagement.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    // Constructors
    public User(String name, String email) {
        this.name = name;
        this.email = name;
    }

    public User() {}

    // Getters and Setters
    public String getName() {
        return this.name;
    } 
    public void setName(String name) {
        this.name = name;
    } 

    // Getters and Setters
    public String getEmail() {
        return this.email;
    } 
    public void setEmail(String email) {
        this.email = email;
    } 
}
