package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class City extends Model {
    @ManyToOne
    private Country country;
    private String name;


    public City(Country country,String name) {
        this();
        this.country=country;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    City() {
        super();
    }

}
