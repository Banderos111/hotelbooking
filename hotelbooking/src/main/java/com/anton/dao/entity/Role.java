package com.anton.dao.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;
}
