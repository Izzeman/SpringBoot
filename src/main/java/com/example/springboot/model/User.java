package com.example.springboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Override
    public String toString(){

        return String.format("id - %d, %s %s, email - %s", id, firstName, lastName, email);
    }
}
