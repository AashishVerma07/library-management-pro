package com.springBoot.library.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    private int Id;

    @Column(name = "author_name")
    private String Name;

    public Author(int id, String name) {
        Id = id;
        Name = name;
    }

    
}
