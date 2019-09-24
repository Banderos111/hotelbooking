package com.anton.dao.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String firstName;

    @Column
    private String secondName;

    @Column
    private String mail;

    @Column
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
