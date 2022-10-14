package com.example.demo.domain;

import org.hibernate.annotations.GenerationTime;

import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.Generated;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Model {
    @Generated(GenerationTime.INSERT)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    public long getId() {
        return id;
    }
}
